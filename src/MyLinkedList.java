import java.util.LinkedList;
/*
 * Program To Create LinkedList
 */
public class MyLinkedList {
	/*
	 * Declaring Main Method 
	 */
	public static void main(String[] args) {
		//Creating Integer Type Of Linked List With Name Of myList
		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.add(56);//Adding 56 To myList
		myList.add(30);//Adding 30 To myList
		myList.add(70);//Adding 70 To myList
		//Printing Linked List Here
		System.out.println("Linked list is : " +myList);
	}
}
