package CollectionsTest;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        System.out.println(queue.isEmpty());
        queue.offer("你");
        queue.offer("是");
        queue.offer("超");
        queue.offer("人");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        queue.isEmpty();

    }
}
