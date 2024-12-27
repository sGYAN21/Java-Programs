public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String modelNumber, String company, String name) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.modelNumber = modelNumber;
        this.company = company;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "My Car name is: "+ name;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car swift = new Car(4,4,120,"CARBON","Maruti","SWIFT");
        System.out.println(swift.toString());
    }
}
