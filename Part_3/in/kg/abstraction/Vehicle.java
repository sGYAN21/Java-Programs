package in.kg.abstraction;

public abstract class Vehicle implements Transport {
    private int noOfTires;
    public abstract void makeStartSound ();

    @Override
    public void getSetGo() {
        System.out.println("Going to Place");
    }

    public Vehicle(int noOfTires)
    {
        this.noOfTires= noOfTires;

    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void commute()
    {
        System.out.println("Going...");
    }
}
