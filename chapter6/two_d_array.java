import java.io.OutputStream;

public class two_d_array {
    public static void main(String[] args) {
        int [][]flats=new int[2][3];
         flats [0][0]=100;
         flats [0][1]=101;
         flats [0][2]=1002;
         flats [1][0]=102;
         flats [1][1]=103;
         flats [1][2]=1003;
           
        //  System.out.println(flats.length);

          for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){

                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
          }

    }
    
}
