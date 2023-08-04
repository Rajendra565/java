import java.util.Random;
import java.util.Scanner;

class game{
    int number ;
    int input;
    int nfG=0;//nfG-->no of guesses
    public game(){
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
    }
    public void setnfG(int n){
          nfG=n;
    }
    public int getnfG(){
        return nfG;
    }
}



public class guess_number {
    public static void main(String[] args) {
        game play=new game();
        
    }
}
