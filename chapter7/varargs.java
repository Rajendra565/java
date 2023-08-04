public class varargs {
 static int num(int ...arr){
    int sum=0;
    for (int i : arr) {
        sum+=i;
    }
    return sum;

 }  
 public static void main(String[] args) {
    System.out.println(num(4));
    System.out.println(num(7,8));
    System.out.println(num(99,90,80));
 }
}
