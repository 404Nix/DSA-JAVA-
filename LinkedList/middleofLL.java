public class middleofLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        printlist(head);
        System.out.print("Middle of the linked list is: ");
        middle(head);
    }

    static void middle(Node head){
        if (head == null) {
            return;
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.data);
    }
    static void printlist(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.println();
    }
}

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
