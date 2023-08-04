import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String argsssss[]){
        Set<Integer> ts=new TreeSet<>();
        ts.add(44);
        ts.add(43);
        ts.add(45);
        ts.add(41);
        ts.add(11);
        System.out.println(ts);
        ts.remove(11);
        System.out.println(ts);
        System.out.println(ts.contains(44));
        System.out.println(ts.isEmpty());
        System.out.println(ts.size());
        ts.clear();
        System.out.println(ts);

    }
}
