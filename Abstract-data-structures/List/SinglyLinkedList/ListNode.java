public class ListNode {

	private int data;
	private ListNode nodeLink;
	
	public ListNode() {
	}
	
	public ListNode(int data) {
		this(data, null);
	}
	
	public ListNode(int data, ListNode nodeLink) {
		this.data = data;
		this.nodeLink = nodeLink;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData (int data) {
		this.data = data;
	}
	
	public ListNode getNodeLink() {
		return this.nodeLink;
	} 
	
	public void setNodeLink(ListNode nodeLink) {
		this.nodeLink = nodeLink;
	}
}
