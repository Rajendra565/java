import java.util.ArrayList;
import java.util.List;

public class arraylist {

    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        // System.out.println(list);
        // for(Integer arr:list){
        //     System.out.print(arr+" ");
        // }
        // for (Integer arr : list) {
        //     System.out.println(arr);
        // }
        System.out.println(list);
        // list.remove(Integer.valueOf(12));/*------>this value elemant */
        list.remove(2);/*------>this index elemant */
    //    System.out.println( list.get(4));/*------>this is  search elemant index */
            // list.set(4, 4444444);/*------>this is updata the vaule */
            List<Integer> newelemant=new  ArrayList<>();
            newelemant.add(2222);
            newelemant.add(1111);
            newelemant.add(333);

            // list.addAll(newelemant)  ;/*------>this is  two list mager in onelist */
            
            // list.clear();/*------>this is clear all elemant is list */
        System.out.println(list);
    }
}