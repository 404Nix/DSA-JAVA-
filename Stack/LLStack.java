public class LLStack {
    public static void main(String[] args) {
        mystack stack = new mystack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}

class node{
    int data;
    node next;
    node(int x){
        data = x;
        next = null;
    }
}

class mystack{
    node head;
    int s;
    mystack(){
        head = null;
        s = 0;
    }

    void push(int x){
        node temp = new node(x);
        temp.next = head;
        head = temp;
        s++;
    }

    int pop(){
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        head = head.next;
        s--;
        return res;
    }

    int peek(){
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    int size(){
        return s;
    }

    boolean isEmpty(){
        return (head == null);
    }
}
