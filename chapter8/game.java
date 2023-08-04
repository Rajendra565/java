class roster_game{
    public void hit(){
        System.out.println("Hitting the enemey...");
    }
    public void run(){
        System.out.println("runing the enemey...");

    }

    public void  frie(){
        System.out.println("frieing the enemey...");
    }
}




public class game {
    public static void main(String[] args) {
        roster_game palyer1=new roster_game();
        palyer1.run();
        palyer1.hit();
        palyer1.frie();
    }
}
