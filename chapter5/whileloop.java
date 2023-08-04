import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        System.out.println("enter you number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
