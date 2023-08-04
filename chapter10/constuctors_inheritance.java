
class home{
    public home(){
        System.out.println("i am constuctors home class");
    }
}
class room extends home {
    public room(){
        System.out.println("i am constuctors room class");
    }
}
class room1 extends room{
    public room1(){
        System.out.println("i am constuctors room1 class");
        
    }
}
public class constuctors_inheritance {
    public static void main(String[] args) {
        // room rajendra=new room();
        room1 rajendra=new room1();
    }
    
}
