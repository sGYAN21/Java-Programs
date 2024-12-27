package in.Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c= new Car();

        Vehicle vCar= new Car();
        Plane p = new Plane();
        c.start();
        p.start();
//        Car cVehile = (Car) new Vehicle();
//        castTest(c);
//        castTest(p);
    }
    private static void castTest(Vehicle veh)
    {

        veh.start();
    }

}
