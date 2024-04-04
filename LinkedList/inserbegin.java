public class inserbegin {
    public static void main(String[] args) {
        Node head = null;
        head = inserbeginlist(head, 10);
        head = inserbeginlist(head, 20);
        head = inserbeginlist(head, 30);
        printlist(head);
        
    }
    static Node inserbeginlist(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;

    }
    static void printlist(Node head){
        while (head !=null) {
            System.out.print(head.data+"-->");
            head = head.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node( int x){
        data = x;
        next = null;
    }
}
