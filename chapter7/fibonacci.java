import java.util.Scanner;

public class fibonacci {
    static int f(int n){
        if (n==0) {
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return f(n-1)+f(n+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f(n));
        
    }
}
