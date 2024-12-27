package in.Polymorphism;

public class Car extends Vehicle{

    Car(int noOfTires)
    {
        super(noOfTires);
    }
    Car()
    {
        super();
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTires());
        System.out.println("Car is Starting");
    }
}
