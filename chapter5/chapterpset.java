import java.util.Scanner;

// public class chapterpset {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n;i>0;i--){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//                System.out.print("\n");
//         }
//     }
// }
public class chapterpset {

    public static void main(String[] args) {
        System.out.println("enter your number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<n){
            sum=sum+(2*i);
          
            i++;

        }
        System.out.print(sum);
    }
}
