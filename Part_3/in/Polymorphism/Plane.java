package in.Polymorphism;

public class Plane extends Vehicle {

    @Override
    public void start() {
        super.start();
        System.out.println("Plane is Taking off...");
    }
}
