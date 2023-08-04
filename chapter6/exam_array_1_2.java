import java.util.Scanner;

// public class exam_array {
//     public static void main(String[] args) {
//     float []mark={45.7f,90.8f,88.9f,90.67f,100};
//     float sum=0;
//    for (float f : mark) {
//          sum=sum+f;
//    }

    
//     System.out.println(sum);
//     }
// }
public class exam_array_1_2{

    public static void main(String[] args) {
        float []mark={90.56f,60.76f,69.68f,89.90f,100};
        System.out.println(mark.length);
        System.out.println("enter your an arrays");
        Scanner sc=new Scanner(System.in);
        float num=sc.nextFloat();
        boolean isin=false;
        for (float f : mark) {
            if(f==num){
                 isin=true;
                break;

            }
            
        }
          if(isin){
            System.out.println("this  integer in present an arrays ");
          }
          else{
            System.out.println("this  integer in not present an arrays ");

          }
    }
}
