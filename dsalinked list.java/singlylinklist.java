class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // List ke aakhiri mein naya data jodna
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Kisi value ko list se delete karna
    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Poori list ko screen par dikhana
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Code ko chala kar check karne ke liye Main class
public class singlylinklist {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        // Data daalna
        myList.insert(10);
        myList.insert(20);
        myList.insert(30);

        System.out.println("Shuruati List:");
        myList.printList(); // Output: 10 -> 20 -> 30 -> null

        // Data delete karna
        myList.delete(20);

        System.out.println("\n20 Delete karne ke baad:");
        myList.printList(); // Output: 10 -> 30 -> null
    }
}
