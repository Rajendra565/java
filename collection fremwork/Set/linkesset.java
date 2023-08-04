// import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Set;
// import java.util.TreeSet;

public class linkesset {
    public static void main(String  args[]){
        Set <Integer> ls=new LinkedHashSet<>() ;
        ls.add(55);
        ls. add(11);
        ls.add(33);
        ls.add(44);
        ls.add(22);
        System.out.println(ls);
        ls.remove(22);
        System.out.println(ls);
        System.out.println(ls.contains(55));
        System.out.println(  ls.isEmpty());
        System.out.println(ls.size());
        ls.clear();
        System.out.println(ls);

    
    }
}
