import java.util.Scanner;
//1. write a java program to print multiplication tableint n number.
// public class pset {
//     static int table(int n){
//         int mul=0;
//         for(int i=1;i<=10;i++){
//             mul=n*i;
//             System.out.println(mul);
//         }
//         return 0;
//     }
  
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number to print table");
//         int n=sc.nextInt();
//         table(n);
        
//     }
// }
        
               // 2.write a java program to print the pattern    *
                    //    **
                    //    *** 
                    //    ****
                    //    *****

public class pset1_2{
static  int pattern(int n){
    for(int i=0;i<=n;i++){
      for(int j=0;j<i;j++){
        System.out.print("*");
      }
      System.out.println("");
    }
    return 0;
}
    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }
}


