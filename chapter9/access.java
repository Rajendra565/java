    class employee{
    private int age;
    private String name;
    public void setage(int a){
        // System.out.println("employee age :");
        age=a;

    }
    public int getage(){
        return age;

    }
    public void setname(String n){
        // System.out.println("employee age :");
        name=n;

    }
    public String getname(){
        return name;
        
    }

}    
     
    public class access {

    public static void main(String[] args) {
        employee rajendra=new employee();
        rajendra.setage(20);
        rajendra.setname("Rajnedra");
        System.out.println("my age is: "+rajendra.getage());
        System.out.println("hi i am "+rajendra.getname());
    }
}