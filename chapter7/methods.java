

public class methods {
   static int name(int a,int b) 
   {
    int c;
    if (a>b) {
        c=a+b;
   } 
   else{
         c=(a*b)/2;
   }
    
       return c;

    }
    public static void main(String[] args) {
        int x=5;
        int y=9;
        int z=name(x, y);
        System.out.println(z);
    }
    
}