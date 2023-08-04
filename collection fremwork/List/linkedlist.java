import java .util.LinkedList;
import java.util.Queue;
public class linkedlist {
    public static void main(String[] args) {
        Queue <Integer> elemant=new LinkedList<>();
        elemant.add(10);
        elemant.add(20);
        elemant.add(30);
        elemant.add(40);
        elemant.add(50);
        System.out.println(elemant);
         elemant.remove();
         System.out.println(elemant);
    }
}
