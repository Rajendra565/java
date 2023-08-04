class home{
    private int age;
    private String name;
      public home(int myage,String myname){
        age=myage;
        name=myname;
      }
    //   public void setage(int a){
        // age=a;

    //   }
      public int getage(){
        return age;

      }
    //   public void setname(String n){
    //      name=n;
    //   }
      public String getname(){
        return name;
      }
}




public class cosntractors {
 public static void main(String[] args) {
    home rajendra=new home(20,"rajendra");
     System.out.println("my age : "+rajendra.getage());
     System.out.println("hi i am "+rajendra.getname());
 }   
}
