public class insertend {
    public static void main(String[] args) {
        Node head = null;
        head = insertendlist(head, 10);
        head = insertendlist(head, 20);
        head = insertendlist(head, 30);
        head = insertbeginlist(head, 5);
        printlist(head);
    }

    static Node insertendlist(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    static Node insertbeginlist(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
