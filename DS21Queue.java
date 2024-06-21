import java.util.*;

public class DS21Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        System.out.println("Is empty? " + queue.isEmpty());
        
        queue.offer("Raman");
        queue.offer("Dev");
        queue.offer("Chad");
        queue.offer("Owais");
        
        System.out.println("Size: " + queue.size());
        System.out.println(queue);
        
        System.out.println("Does it contains Chad? " + queue.contains("Chad"));
        
        queue.poll();
        queue.poll();
        queue.poll();
        
        System.out.println(queue);
        System.out.println("Peek: " + queue.peek());

        //Priority Queues

        //Queue <Double> queue2 = new PriorityQueue<>();
        Queue <Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        queue2.offer(6.5);
        queue2.offer(1.5);
        queue2.offer(7.5);
        queue2.offer(2.5);
        queue2.offer(4.5);
        queue2.offer(3.5);

        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
        
    }
    
}
