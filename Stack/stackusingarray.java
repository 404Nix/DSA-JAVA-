public class stackusingarray {
    public static void main(String[] args) {
        mystack stk = new mystack(10);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        System.out.println(stk.pop());
        
        System.out.println(stk.peek());
        System.out.println(stk.isEmpty());
        System.out.println(stk.size());
    }
}

class mystack{
    int top;
    int cap;
    int[] arr;

    mystack(int c){
        cap = c;
        top = -1;
        arr = new int[cap];
    }
    void push(int x){
        top++;
        arr[top] = x;
    }

    int pop(){
        int res = arr[top];
        top--;
        return res;
    }

    int peek(){
        return arr[top];
    }

    boolean isEmpty(){
        return (top==-1);
    }

    int size(){
        return top+1;
    }

}
