public class SinglyLinkedList {

	/**
	 * @author Ercross
	 */
	
	public ListNode headNode;
	public ListNode tailNode;
	public int size; 
	
	public SinglyLinkedList() {
		headNode = null;
		tailNode = null;
		size = 0;
	}
	
	public ListNode getNode (int nodePosition) { 
		if(nodePosition <= 1) {
			return headNode;
		}
		if(nodePosition > size) {
			return tailNode;
		}
		ListNode listNode = headNode;
		for (int i=2; i<= nodePosition; i++){
			listNode = listNode.getNodeLink();
		}
		return listNode;
	}
	
	public void add(int data) { //automatically appends data to end of the list
		
		ListNode newNode = new ListNode(data);

		if (size == 0) {
			headNode = newNode;
			size++;
			return;
		}
		if (size > 1) {
			tailNode.setNodeLink(newNode);
			size++;
			tailNode = newNode;
			return;
		}
		if (size == 1) {
			tailNode = newNode;
			headNode.setNodeLink(newNode);
			size++;
			return;
		}
	}
	
	public void add(int data, int nodePosition) {
		ListNode newNode = new ListNode (data);
		
		if ((nodePosition <= 1) && (size != 0)) { //set new node as head node if list is not empty
			newNode.setNodeLink(headNode);
			headNode = newNode;
			size++;
			return;
		}

		if ((nodePosition <=1) && (size == 0)){ //appends data as head node if list is empty
			headNode = newNode;
			size++;
			return;
		}
		
		if (nodePosition >= size) { //appends data to the list end if true
			add(data);
			return;
		}
		else {
			ListNode previousNode = getNode((nodePosition-1));
			ListNode nextNode = getNode((nodePosition));
			
			previousNode.setNodeLink(newNode);
			newNode.setNodeLink(nextNode);
			size++;
			return;
		}
	}
	
	public void clear () {
		headNode = null;
		tailNode = null;
		size = 0;
	}
	
	public void remove (ListNode node) {
		if (size == 0) {
			System.out.println("Remove operation failed on empty list");
			return;
		}
		
		if (node == headNode && size > 1) {
			ListNode nextNode = headNode.getNodeLink();
			headNode.setNodeLink(null);
			headNode = nextNode;
			size--;
			return;
		}
		
		if (size == 1) {
			clear();
		}
		
		if (node == tailNode) {
			tailNode = getNode(size-1);
			tailNode.setNodeLink(null);
			size--;
			return;
		}
	}
	
	public void printList() {		
		if (headNode == null) {
			System.out.println("List instance is empty");
			return;
		}
		else {
		System.out.print(headNode.getData()+ "-> "); 
		ListNode listNode = new ListNode();
		listNode = headNode;
		while (listNode.getNodeLink() != null){
			listNode = listNode.getNodeLink();
			System.out.print(listNode.getData() + "-> ");
		}
		System.out.println("");
		return;
		}
	}
}
