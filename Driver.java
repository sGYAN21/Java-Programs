public class Driver {
    public static void main(String[] args) {
        car myCar = new car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//       myCar.drive();
//        System.out.println(myCar.getCurrentFuelInLiters());
    car swift = new car();
    swift.addFuel(6);
    car startedCar = swift.start();
    startedCar.drive();
    }
}