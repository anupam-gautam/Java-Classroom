
package Unit3;
//example on single level inheritance
class Vehicle{
    int reg;
    String name;
    String brand;
    String model;
    //setting the instance variable
    public void setVehicle(int reg, String name, String brand,String model){
        this.reg=reg;
        this.name=name;
        this.brand=brand;
        this.model=model;
    }
    public void displayVehicle(){
        System.out.println("registration is "+reg);
        System.out.println("name of vehicle is "+name);
        System.out.println("brand of vehicle is "+brand);
        System.out.println("model of vehicle is "+model);
    }
}
class TwoWheeler extends Vehicle{
    int fuelCapacity;
    int topSpeed;
    public void setTwoWheeler(int fuelCapacity,int topSpeed){
        this.fuelCapacity=fuelCapacity;
        this.topSpeed=topSpeed;
    }
    public void displayTwoWheel(){
        System.out.println("fuel capacity is "+fuelCapacity);
        System.out.println("topspeed is "+topSpeed);
    }
}
//creating another class that inherits TwoWheler
class Bike extends TwoWheeler{
    int milege;
    public void setBike(int milege){
        this.milege=milege;
    }
    public void displayBike(){
        System.out.println("milege of bike is "+milege);
    }
}
public class InheitanceDemo {
    public static void main(String[] args) {
        TwoWheeler t1 = new TwoWheeler();
        //using own proprty
        t1.setTwoWheeler(12, 120);
        t1.displayTwoWheel();
        //using parent property 
        t1.setVehicle(101, "santro","hyundai" , "2022");
        t1.displayVehicle();
        //creating parent class object
        Vehicle v1 = new Vehicle();
        v1.setVehicle(102, "i10", "hyundai", "2011");
        v1.displayVehicle();
        //using child property
        //v1.setTwoWheeler();//cannot use child property
        
        //creating object of Bike
        Bike b1 = new Bike();
        //using own property
        b1.setBike(30);
        b1.displayBike();
        //using parent property
        b1.setTwoWheeler(10, 140);
        b1.displayTwoWheel();
        //using grand parent property
        b1.setVehicle(1003, "pulsar", "bajaj", "2022");
        b1.displayVehicle();
    }
    
}
