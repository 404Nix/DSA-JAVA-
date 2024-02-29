import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class firstprogram{
    public static void main(String[] args){
    Stack<String> news = new Stack<String>();
    //lifo
    news.push("Tanjiro");
    news.push("Inosuke");
    news.push("Nezuko");
    news.push("Zenitsu");
    
    Queue<String> newq = new LinkedList<String>();

    //fifo
    newq.offer("Giyuu");
    newq.offer("Shinobu");
    newq.offer("Muichiro");
    newq.offer("Rengoku");


    System.out.println(newq.peek());
    System.out.println(news.peek());

    }
}