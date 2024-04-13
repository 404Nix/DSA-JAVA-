public class reverselinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
        /*iterative reverse*/
        //head = reverseLL(head);
        /*recursive reverse;*/
        head = recrevlist(head, null);
        printlist(head);
    }

    static Node recrevlist(Node curr, Node prev){
        if (curr==null) {
            return prev;
        }
        Node next = curr.next;
        curr.next = prev;
        return recrevlist(next, curr);
    }

    static Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;
        while (curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printlist(Node head){
        Node curr = head;
        while (curr!=null) {
            System.out.print(curr.data+" 8==D ");
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
