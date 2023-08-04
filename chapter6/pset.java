import java.util.Scanner;

public class pset {
    public static void main(String[] args) {
        int []mark={9,89,89,78,67,46,56,56,46,37,737};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
       int n=sc.nextInt();
       boolean isin=false;
       for (int i : mark) {
        if(i==n){
            isin=true;
            break;

        }
        if(isin){
            System.out.println("this number is present in an arrays");
        }
        else{
            System.out.println("this number is  not present in an arrays");
        }
        
       }
    }
}
