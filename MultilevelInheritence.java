class MainCollege{
    void mainc(){
        System.out.println("Main branch");
    }
}
class College1 extends MainCollege{
    void c1(){
        System.out.println("Main branch-1");
    }
}
class College2 extends College1{
    void c2(){
        System.out.println("Main branch-2");
    }
}
public class Main{
    public static void main(String args[]){
        College2 clg2=new College2();
        clg2.mainc();
        clg2.c1();
        clg2.c2();
    }
}
