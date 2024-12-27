public class car {
   // instance variable
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    public car start()
    {
        if(currentFuelInLiters==0)
        {
            System.out.println("Car is out of Fuel, cannot start");
        }
        else if (currentFuelInLiters<5)
        {
            System.out.println("Car is in reserved mode,please refuel");
            currentFuelInLiters--;
        }
        else {
            System.out.println("Car is Started.. bruhhh.....");
            currentFuelInLiters--;
        }
        return this ;
    }

    public void drive()
    {

       currentFuelInLiters--;

            System.out.println("Car is Driving");

    }
    public void addFuel(float currentFuelInLiters)
    {
        this.currentFuelInLiters +=currentFuelInLiters;
    }
    public float getCurrentFuelInLiters()
    {
        return currentFuelInLiters;
    }

}
