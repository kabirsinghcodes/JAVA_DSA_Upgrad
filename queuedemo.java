import java.util.*;
public class queuedemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("abc");
        queue.add("cde");
        queue.add("efg");
        queue.add("ghi");
        queue.remove();
        System.out.println("Elements in my queue are : "+queue);
        System.out.println("Element removed from my queue "+queue.remove());
        System.out.println("head of my queue : "+queue.peek());
        System.out.println("poll() removes head and returns it : "+ queue.poll());
        System.out.println("now the head will be : "+queue.element());
        System.out.println("final queue is : "+queue);
    }
}
