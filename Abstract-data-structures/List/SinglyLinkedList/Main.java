import static java.lang.Math.*;
public class Main {
	
	/**
	 * @author Ercross 
	 */
	
	private static SinglyLinkedList addTwoNumbers (SinglyLinkedList list1, SinglyLinkedList list2) {
		int remainder = 0;
		int sum;
		SinglyLinkedList outputList = new SinglyLinkedList();
		Main.makeListsSizesEqual(list1, list2);
		list1.printList(); list2.printList();
		for(int i=1; i<=list1.size;i++) {
			sum = (list1.getNode(i).getData()) + (list2.getNode(i).getData()) + remainder;
			if(sum>9) {
				sum = abs((sum-10));
				outputList.add(sum);
				remainder = 1;
			}
			else {
				outputList.add(sum);
				remainder = 0;
				}
		}
		if (remainder == 1) {outputList.add(remainder);}
		return outputList;
	}
	
	private static void makeListsSizesEqual(SinglyLinkedList list1, SinglyLinkedList list2) {
		if(list1.size == list2.size) {
			return;
		}
		
		if(list1.size > list2.size) {
			while (list2.size < list1.size) {
				list2.add(0,1);
			}
			return;
		}
		
		if(list2.size > list1.size) {
			while (list1.size < list2.size) {
				list2.add(0,1);
			}
			return;
		}
	}
	
	public static void main (String args[]) {
		SinglyLinkedList list1 = new SinglyLinkedList();
		SinglyLinkedList list2 = new SinglyLinkedList();
		
		list1.add(2);
		list1.add(4);
		list1.add(3);
		list2.add(5);
		list2.add(6);
		list2.add(4);
		list1.add(5);
		SinglyLinkedList reversedSumList = Main.addTwoNumbers(list1, list2);
		reversedSumList.printList();
	}
}
