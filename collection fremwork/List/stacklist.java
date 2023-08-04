import java.util.Stack;

public class stacklist {
    public static void main(String args[]){
        Stack<Integer> number=new Stack<>();
        number.push(100);
        number.push(200);
        number.push(300);
        number.push(400);
        System.out.println(number);
        System.out.println(number.peek());
        number.pop();
        number.pop();
        number.pop();
        System.out.println(number);
        



    }
}
