import java.util.ArrayDeque;


public class arraydequeeue {

public static void main(String args[]){
    ArrayDeque <Integer> ad=new ArrayDeque<>();
    ad.offer(11);
    ad.offer(22);
    ad.offer(33);
    ad.offer(44);
    ad.offer(55);
    System.out.println(ad);
    ad.offerFirst(100);
    System.out.println(ad);
    ad.offerLast(9999);
    System.out.println(ad);

}
}