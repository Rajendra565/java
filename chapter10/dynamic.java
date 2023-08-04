

class phone {
    public void showtime (){
        System.out.println("this is showtime...");
    }
    public void on(){
        System.out.println("on the phone ...");
    }
}
class smartphone extends phone{
    public  void music (){
        System.out.println("turn on the music...");
    }
    public void on(){
        System.out.println("on the smartphone ...");
    }
}

public class dynamic {
    public static void main(String[] args) {
        smartphone redmi=new smartphone();
        redmi.on();
        redmi.showtime();
        redmi.music();
    }
    
}
