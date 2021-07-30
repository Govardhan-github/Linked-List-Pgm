	/*
	 * Program To Sorting The Element In LinkedList
	 * In This Program Using Sort Element Operation
	 */
public class MyLinkedList {
	/*
	 * Declaring Main Method 
	 */
public static void main(String[] args) {
	LinkedList myList = new LinkedList();//Created LinkedList With The Name Of MyList
	myList.append(56);//Appending 56 To myList
	myList.insertAfter(myList.head,30);//Inserting 30 After First Node To myList
	myList.append(70);//Appending 70 To myList
	System.out.println("Before Deleting Node");
	myList.insertAfter(myList.head.next,40);//Inserting 40 After Head.next To myList
	myList.printList();//Calling PrintList Method
	System.out.println("After Deleting Node");
	myList.deleteNode(40);//Calling Method To delete Node
	myList.printList();//Calling PrintList Method
	myList.searchElement(30);//To Search The Element In Linked List
	myList.sortList();
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
	/*
	 * Pop Last Method To Delete The Last Element
	 */
public void popLast() {
	//If Condition To Check Head Is Null Or Not
    if (head == null) {
        System.out.println("List is Empty"); }
        Node last = head;//Storing Head Value In Last
        Node temp = null;//Temp Value Is Null
        while (last.next != null){
                temp = last;//Last Value Is Stored In Temp 
                last = last.next;//Last.next Stored In Last
        }//End For While Loop
        temp.next = null;
        last.next = temp.next;
}
	/*
	 * Method To Search The Elements In Linked List
	 */
public void searchElement(int myNode)
{
    Node node=head;//Storing Head Value In Node
    int count=1;//Declaring Count Variable With Value 1
    int check=0;//Declaring Check Variable
    while (node != null) {
    	//If Condition To Compare 
        if (node.myNode == myNode){ //If Condition Is Satisfied If Condition Is Break
                check=1;
                break;
        }
        count = count+1;//Incrementing The Count Value
        node=node.next;//Storing node.next Value In node Further Loop
    }//End For While Loop
    if (check==1)//If Check Is One The Print Statement Will Print
        System.out.println("Node with value "+myNode+" is found at position " +count);
    else
        System.out.println("Element is not present in the list");
}

/*
 * Method To Delete Particular Node
 */
public void deleteNode(int node){
	Node temp = head, prev = null;//Here Declaring temp,prev variables 
	// If Condition To Delete The head node itself is a key 
    if(temp != null && temp.myNode == node) {
        head = temp.next;
        return;
    }//End Of If Condition
    // Using While Loop To Search For a Key To Be Deleted
    while (temp != null &&temp.myNode !=node){
        prev = temp;
        temp = temp.next;
    }//End Of While Loop
    //If Key is Not present Return
        if(temp == null)
            return;
            prev.next = temp.next;//To Deleting a Node
}
/*
 * Method To Sort The Elements In List
 * Using Bubble Sort To Sort Linked List An Ascending Order
 */
public void sortList()
{
    Node current = head, index = null;//Declaring Current And Index Variables
    int temp;//Declaring temp Variable
    if (head == null){
        return;
    }
    else{
    	//While Loop Checking Current equals Null Or Not
        while (current != null){
            index = current.next;//current.next Will Be Pointing To Index
        	//While Loop Checking Index equals Null Or Not
            while (index != null){
                // if Current Node.myNode is Greaterthan Index's Node , Swap The Data Between Them
                if(current.myNode > index.myNode){
                    temp = current.myNode;
                    current.myNode = index.myNode;
                    index.myNode = temp;
                }

                index = index.next;//index.next value Is Storing In Index
            }
            current = current.next;//Current.next value Is Storing In Current
        }
    }
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