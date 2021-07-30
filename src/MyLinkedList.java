	/*
	 * Program To Deleting The Elements In Between LinkedList
	 * In This Program Using pop Operation
	 */
public class MyLinkedList {
	/*
	 * Declaring Main Method 
	 */
public static void main(String[] args) {
	LinkedList myList = new LinkedList();//Created LinkedList With The Name Of MyList
	myList.append(56);//Adding 56 To myList
	myList.insertAfter(myList.head,30);//Inserting 30 After First Node To myList
	myList.append(70);//Adding 70 To myList
	System.out.println("Linked List Before Deleting");
	myList.printList();//Calling PrintList Method
	myList.pop();//Pop Method To Delete Head
	System.out.println("Linked List After Deleting");
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
  * public void add (int myNode){
  	Node newNode = new Node(myNode);//Storing The myNode Value in newNode
  	newNode.next=head;//Here head Node Is Accessing To newNode.next and 
  	head=newNode;//Here newNode Is Pointing To Head  
}
  */
    
  /*
   * Method To Append Elements To linked List
   */
public void append(int myNode){
    Node newNode = new Node(myNode);//Storing The myNode Value in newNode
    //If Condition To Store The Head Node    
    if(head == null ){
    head = newNode;//newNode Assigning To Head
    return;
        }
    Node tail = head;//Storing Head Value As Tail
    //While Condition Is To Traverse Elements And Store Tail Value
    while (tail.next !=null) {
       tail = tail.next;//Tail.next Stored As Tail
    }//End For While Loop
    tail.next=newNode;//Stroing newNode In Tail
}

/*
 *  Method To Insert Element 30 between 56 and 70
 *  With The Parameters Of PrevNode , myNode
 */
public void insertAfter(Node prevNode, int myNode) {
    if (prevNode == null) {
       System.out.println("previous node should not be null");//PrevNode Is Null Printing The Statement
    return;
    }//End For If Condition
    Node newNode = new Node(myNode);//Storing The myNode Value in newNode
    newNode.next = prevNode.next;//Assigning newNode.next Value to prevNode.next 
    prevNode.next = newNode;//newNode Value Stored In PrevNode.next
}
//Pop Method To pop Head
public void pop(){
	//If Condition To Checking Head Is Null Or Not
    if (head == null){
         System.out.println("Should not be null");
         return;
    }
    head = head.next;//Head Pointer To Head.next After Deleting The Head
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
