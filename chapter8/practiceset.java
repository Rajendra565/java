public class practiceset {

    public static void main(String[] args) {
        home rajendra=new home(12,"Rajendra",20);
      System.out.println(rajendra.getid());
      System.out.println(rajendra.name());
      System.out.println(rajendra.getage());
        
    }
}
class home{
   static  int id;
   static String name;
   static int age;
   home(int id, String name,int age){
    this.id=id;
    this.name=name;
    this.age=age;
   }

   public int getid(){
    return id;
   }
   public String name(){
    return name;
   }
   public int getage(){
    return age;
   }
}