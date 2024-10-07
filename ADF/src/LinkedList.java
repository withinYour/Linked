
// LinkedList class that handles the operations on the list
class LinkedList {
    private Node head;   // reference to the first node in the list
    private Node tail;   // reference to the last node in the list
    private int length;  // number of nodes in the list

    // Constructor that initializes the list with a single node
    public LinkedList(int data) {
        Node newNode = new Node(data);  // create a new node with the provided data
        this.head = newNode;            // head and tail both point to this node initially
        this.tail = newNode;
        this.length = 1;                // list starts with 1 node
    }

    // Method to add a new node to the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data);  // create a new node
        this.tail.next = newNode;       // point the current tail's next to the new node
        this.tail = newNode;            // update the tail to the new node
        this.length++;                  // increment the length
    }

    // Method to get the head of the list
    public Node getHead() {
        return this.head;
    }

    // Method to get the tail of the list
    public Node getTail() {
        return this.tail;
    }

    // Method to get the length of the list
    public int getLength() {
        return this.length;
    }
}
// Node class to define each element (node) in the LinkedList
class Node {
    int data;        // data stored in the node
    Node next;       // reference to the next node

    // Constructor to create a new node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}



