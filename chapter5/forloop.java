import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf("%d\n",i);
        }
    }
}
