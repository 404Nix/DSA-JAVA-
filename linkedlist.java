// import java.util.LinkedList;

// public class linkedlist {
//     public static void main(String[] args) {
//         LinkedList<String> linklist = new LinkedList<String>();

//         linklist.offer("A");
//         linklist.offer("B");
//         linklist.offer("C");
//         linklist.offer("E");
//         linklist.offer("F");

//         linklist.addFirst("0");
//         linklist.addLast("1");
//         linklist.add(3,"D");
//         System.out.println(linklist);
//         linklist.remove(3);
//         linklist.removeFirst();
//         linklist.removeLast();
//         System.out.println(linklist);
//     }
// }


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    SinglyLinkedList() {
        this.head = null;
    }

    // Insertion at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion at the end
    public void insertAtEnd(int data) {
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

    // Insertion at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Deletion at the beginning
    public void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Deletion at the end
    public void deleteAtEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Deletion at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position");
            return;
        }
        current.next = current.next.next;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class linkedlist {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtBeginning(5);

        System.out.println("Original Linked List:");
        linkedList.display();

        linkedList.insertAtPosition(15, 2);
        System.out.println("Linked List after insertion at position 2:");
        linkedList.display();

        linkedList.deleteAtBeginning();
        System.out.println("Linked List after deletion at the beginning:");
        linkedList.display();

        linkedList.deleteAtEnd();
        System.out.println("Linked List after deletion at the end:");
        linkedList.display();

        linkedList.deleteAtPosition(1);
        System.out.println("Linked List after deletion at position 1:");
        linkedList.display();
    }
}
