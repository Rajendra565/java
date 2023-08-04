 class a{
    public  void meth1(){
        System.out.println("i am method 1 in a class ");
    }
 }
 class b extends a{
    public  void meth1(){
        System.out.println("i am method 1 in b class ");
    }
    
 }
public class method_overriding {
    public static void main(String[] args) {
        b x=new b();
        x.meth1();

    }
    
}
