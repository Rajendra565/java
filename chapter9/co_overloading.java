class home{
    private int age;
    private String name;
    private int id;
    public home(){
        System.out.println("welcome to java in cosntactors");
    }
    public home(int a){
        age=a;

    }
    public home(int a1,String n){
        age=a1;
        name=n;

    }
    public home(int a2,String n1,int i){
        age=a2;
        name=n1;
        id=i;

    }
    // public void setage(int age){
    //    this. age=age;

    // }
    // public int getage(){
    //     return age;
    // }
    // // public void setname(String name){
    // //     this. name=name;
 
    // //  }
    //  public String getname(){
    //      return name;
    //  }
    // //  public void setid(int id){
    // //     this. id=id;
 
    // //  }
    //  public int getid(){
    //      return id;
    //  }
    public void print(){
        System.out.println("hi i am "+name);
        System.out.println("my id is "+id);
        System.out.println("my age is "+age);

} 
}






public class co_overloading {
    public static void main(String[] args) {
        home rajendra=new home(20,"rajendra",2001204056);
        
        // home rajendra1=new home(20);
        // rajendra.getage(20);
        // System.out.println(rajendra.getage());
       rajendra. print();
    }
}
