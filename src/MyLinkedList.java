	/*
	 * Program To Add The Elements To LinkedList
	 * In This Program Using Add Operation
	 */
public class MyLinkedList {
	/*
	 * Declaring Main Method 
	 */
public static void main(String[] args) {
	LinkedList myList = new LinkedList();//Created LinkedList With The Name Of MyList
	myList.add(70);//Adding 70 To myList
	myList.add(30);//Adding 30 To myList
	myList.add(56);//Adding 56 To myList
	myList.printList();//Calling PrintList Method
	}
}
//Here Declaring Linked List Class
class LinkedList{
    Node head;
  //Here Declaring Node Class
    class Node {
	   int myNode;//Declaring Variable myNode
       Node next;
       //Here Declaring Parametarised Constructor
       //And Intialising The myNode And Next
       Node(int myNode){
          this.myNode = myNode;
          next = null;
     }
}
    /*
     * Method To Add elements To linked List
     */
public void add (int myNode){
    Node newNode = new Node(myNode);//Storing The myNode Value in newNode
    newNode.next=head;//Here head Node Is Accessing To newNode.next and 
    head=newNode;//Here newNode Is Pointing To Head
    }
// Method To print Linked List
public void printList(){
    System.out.println("LinkedList:");//Print Statement To Print LinkedList
    Node temp=head;//Head Is Storing In temp
    //While Condition To Traversing The Nodes To print
    while (temp != null){ 
      System.out.println(temp.myNode);//Here Printing The Temp.myNode
      temp = temp.next;//Here Temp is Pointing To Temp.next And Again It Will Traverse To Next Node 
        }
    }
}
