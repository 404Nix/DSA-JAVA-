public class sortedinsert {
    public static void main(String[] args) {
        Node head = null;
        head = insertend(head, 10);
        head = insertend(head, 20);
        head = insertend(head, 30);
        head = insertend(head, 40);
        head = insertend(head, 50);
        printlist(head);
        head = deletehead(head);
        printlist(head);
        head = deletelast(head);
        printlist(head);
        head = insertatpos(head, 4, 45);
        printlist(head);
        head = sortedll(head, 10);
        printlist(head);
    }

    static Node sortedll(Node head, int x){
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        if (x < head.data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.next.data < x) {
                curr = curr.next;
                break;
            }
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static Node insertatpos(Node head, int pos, int x){
        Node temp = new Node(x);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos-2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static Node deletehead(Node head){
        if (head == null) {
            return null;
        }
        else{
            head = head.next;
            return head;
        }
    }

    static Node deletelast(Node head){
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    static Node insertend(Node head, int x) {
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

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println();
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
