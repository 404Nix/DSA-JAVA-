public class searchinglist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(searchll(head, 20));
        printlist(head);
    }
    static int searchll(Node head,int x){
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            }else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    static void printlist(Node head){
        Node curr = head;
        if (curr == null) {
            return;
        }
        System.out.print(curr.data+"-->");
        printlist(head.next);
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