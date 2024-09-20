class Petrol{
    void petrol1(){
        System.out.println(" Uses Petrol");
    }
}
class Bike extends Petrol{
    void bike1(){
        System.out.print("Bike");
    }
}
class Car extends Petrol{
    void car1(){
        System.out.print("Car");
    }
}
public class Main{
    public static void main(String args[]){
        Bike b1=new Bike();
        b1.bike1();
        b1.petrol1();
        
        Car c1=new Car();
        c1.car1();
        c1.petrol1();
    }
}
