 class home{
    int age;
    String name;
    String gender;
    int salary;
    public void print(){
        System.out.println("hi i am "+name);
        System.out.println("my age is "+age);
        System.out.println("i am "+gender);
        System.out.println("salary "+salary);
    }

}

public class oops {
        public static void main(String[] args) {
            home father=new home();
            home mother=new home();
            home bother=new home();
            home me=new home();
            home sister=new home();


        father.age=50;
        father.name="Simanchal";
        father.gender="male";
        father.salary=40000;
        mother.age=45;
        mother.name="Rashmita";
        mother.gender="female";
        bother.age=25;
        bother.name="Alok";
        bother.gender="male";
        me.age=20;
        me.name="Rajendra";
        me.gender="male";

        sister.age=15;
        sister.name="purnaima";
        sister.gender="female";        
         father.print();
         mother.print();
         bother.print();
         me.print();
         sister.print();

        

    }
}