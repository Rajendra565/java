 
 
 class home{
    int x;
    public void setx(int x){
        this.x=x;  
    }
    public int getx(){
        return x;
    }
}
class room extends home{
    int y;
    public void sety(int y){
        this.y=y;

    }
    public int gety(){
        return y;
    }
}


public class inheritance {

    public static void main(String[] args) {
        room ra=new room();
        ra.setx(29);
        ra.sety(29);
        System.out.println(ra.getx());
        System.out.println(ra.gety());
        System.out.println(ra.getx()+ra.gety());

    }
}        