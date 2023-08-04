// public class hello {
//        static void name(int []arr){
//         arr[0]=88;
        
//        }
//     public static void main(String[] args) {
//         int []arr={1,2,3,4,9};
        
//          name(arr);
//          System.out.println(arr[0]);
//     }
// }

           // overloding
public class overloading {
    static void age(){
        System.out.println("this is overloading");
    }
    static void age(int a){
        System.out.println("this is a overloading");
    }
public static void main(String[] args) {
    age();
    age(1);
    
}
    
}