
// Main class to test the LinkedList implementation
public class Main {
    public static void main(String[] args) {
        // Create a new LinkedList with an initial value of 4
        LinkedList list = new LinkedList(4);

        // Add more nodes to the list
        list.addNode(10);
        list.addNode(20);

        // Output the head, tail, and length of the list
        System.out.println("Head: " + list.getHead().data);  // Output: 4
        System.out.println("Tail: " + list.getTail().data);  // Output: 20
        System.out.println("Length: " + list.getLength());   // Output: 3
    }
}

