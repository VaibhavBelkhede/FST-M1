package activities;

public class car {
    String colur;
    String transamission;
    int make;
    int tyre;
    int door;

  public car ()
    {
    tyre= 4;
    door=4;
    }
public void displayCharacteristics()
{
    System.out.println("car colour is "+colur);
    System.out.println("car make is "+make);
    System.out.println("car tyre is "+tyre);
    System.out.println("car doors "+door);
    System.out.println("car transmission is "+transamission);
}

public void accelarate()
{
    System.out.println("Car is Moving forward.");
}
public void brake()
{
    System.out.println("Car has stopped");
}



}
