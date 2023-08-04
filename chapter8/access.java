class myhome{
   private int id;
   private String name;

   public void setname(String n){
         name=n;
   }
   public String getname(){
        return name;
   }
   public void setid( int i){
   id=i;
}
public int getid(){
   return id;
}
}

public class access{
    public static void main(String[] args) {
    myhome rajendra=new myhome();
    rajendra .setname("Rajendra");
    System.out.println(rajendra.getname()); 
    rajendra.setid(56); 
    System.out.println(rajendra.getid());  
    }
}
