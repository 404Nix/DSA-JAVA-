public class Treetraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.right = new Node(30);
        root.right.right = new Node(50);
        inorderPrint(root);
    }
    static void inorderPrint(Node root){
        if (root != null) {
            inorderPrint(root.left);
            System.out.print(root.key + " ");
            inorderPrint(root.right);
        }
    }
}

class Node {
    int key;
    Node left;
    Node right;
    Node(int x){
        key = x;
    }
}

