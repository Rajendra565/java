import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String args[]){
        Queue <Integer> qu=new LinkedList<>();
        qu.offer(11);
        qu.offer(22);
        qu.offer(33);
        qu.offer(44);
        qu.offer(55);
       System.out.println( qu.peek());
        System.out.println(qu);
        qu.poll();
        System.out.println(qu);

    }
}
