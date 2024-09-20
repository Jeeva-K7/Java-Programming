class A{
    void eat(){
        System.out.println("Eating");
    }
}
class B extends A{
    void food(){
        System.out.println("Pizza");
    }
}
public class Main{
    public static void main(String args[]){
        B b1=new B();
        b1.food();
        b1.eat();
    }
}
