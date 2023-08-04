import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        System.out.print("input the vaule ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;

        }while(i<=n);
    }
    
}
