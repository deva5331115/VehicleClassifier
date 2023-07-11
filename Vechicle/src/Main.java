class Vehicle {
    public void start() {
        System.out.println("Vehicle is started");
    }
    public void stop() {
        System.out.println("Vehicle is stopped");
    }

}
class Car {
    public void start() {
        System.out.println("Car is started");
    }
    public void stop() {
        System.out.println("Car is stopped");
    }

}
class Motorcycle {
    public void start() {
        System.out.println("Motorcycle is started");
    }
    public void stop() {
        System.out.println("Motorcycle is stopped");
    }

}


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        vehicle.stop();
        Car car=new Car();
        car.start();
        Motorcycle motorcycle =new Motorcycle();
        motorcycle.start();
        car.stop();
    }
}