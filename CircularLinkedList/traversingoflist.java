public class traversingoflist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        printlist(head);
    }    
    static void printlist(Node head){
        if (head == null) {
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data+"-->");
            curr = curr.next;
        } while (curr != head);
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