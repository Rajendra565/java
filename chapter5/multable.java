import java.util.Scanner;

// import java.util.Scanner;

// public class multable {
//     public static void main(String[] args) {
//         System.out.print("Enter your table number : ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             int mul=n*i;

//             System.out.printf("%d X %d=%d\n",n,i,mul);
//         }
//     }
// }
public class multable {

    public static void main(String[] args) {
        System.out.print("enter your number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=10;i>n;i--){
            System.out.println(i);
        }
    }
}
