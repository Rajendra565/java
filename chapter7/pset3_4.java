// public class pset3_4 {
//     // write a recurise funtion to calculate sum of first n natural number .
// static int sumnat(int n){
//     if(n==0){
//         return 1;

//     }
//     else{
//         return n+sumnat(n-1);
//     }
// }
//     public static void main(String[] args) {
//         int n;
//         System.out.println(sumnat(2));
//     }
// }
        //write a funtion to print the following patern  
                                    // *****
                                    // ****
                                    // ***
                                    // **
                                    // *

                                                         
public class pset3_4 {
static void patern(int n){
    for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
    public static void main(String[] args) {
     int n;
     
       patern(5);
    }
}