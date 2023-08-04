class home{
    int id;
    String name;
    public home(int id ,String name){
       this. id=id;
       this. name=name;
        
    }
    // public void setid(int i){
    //     id=i;
    // }
    public int getid(){
        return id;
    }
    // public void setname(String n){
    //     name=n;
    // }
    public String getname(){
        return name;
    }
}


public class costrustors {
    public static void main(String[] args) {
        home rajendra=new home(68,"Rajendra");
        System.out.println(rajendra.getid());
        System.out.println(rajendra.getname());
    }
}
