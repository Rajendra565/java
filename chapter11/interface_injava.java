interface  bike{
     void speedup();
     void break1();

}
interface start{
    void kice();
}
class bicyle implements bike , start{
    public void speedup(){
        System.out.println("speed up bicyle...");
    }
   public  void break1(){
        System.out.println("break the bicyle...");
    }
    public void kice(){
          System.out.println("start bicyle...");
    }

    
}

public class interface_injava{
    public static void main(String[] args) {
        bicyle ta=new bicyle();
        // ta.break1();
        // ta.kice();
        ta.notifyAll();
    }
    
}
