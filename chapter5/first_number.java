import java.util.Scanner;

public class first_number {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      int sum=0;
      System.out.println("loop");
      for(int i=1;i<=n;i++){
         sum=sum+(2*i);
        System.out.println(sum);
      }
    }
}
