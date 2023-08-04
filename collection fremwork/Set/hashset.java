import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set <Integer> hs=new HashSet<>();
        System.out.println(hs.isEmpty());
        hs.add(11);
        hs.add(22);
        hs.add(33);
        hs.add(44);
        hs.add(55);
        System.out.println(hs);
      System.out.println(  hs.contains(5));
      System.out.println(hs.size());
      hs.remove(55);
      System.out.println(hs);
    System.out.println(  hs.isEmpty());
    hs.clear();
    System.out.println(hs);

    }
}
