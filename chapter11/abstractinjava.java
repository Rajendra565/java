abstract class phone {
    abstract void greet();
    abstract void greet1();

}
 class smartphone extends phone{
    public void greet(){
        System.out.println("good morning ...");
    }
    public void greet1(){
        System.out.println("good night ....");
    }
 }
 class smartphone1 extends smartphone{

 }


public class abstractinjava{

    public static void main(String[] args) {
        smartphone1 redmi=new smartphone1();
        redmi.greet();
        redmi.greet1();
    }
}