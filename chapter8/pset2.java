
class callphone{
    public void ring() {
        System.out.println("ringing...");
        
    }
    public void vibarat(){
        System.out.println("vibarating...");
    }
    public void call(){
        System.out.println("calling rajendra...");
    }
}
public class pset2 {
    public static void main(String[] args) {
        // callphone redmi=new callphone();  
        callphone realme=new callphone();

        realme.ring();
        realme.vibarat();
        realme.call();
    }
}
