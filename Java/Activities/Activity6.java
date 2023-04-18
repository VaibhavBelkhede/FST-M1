package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6
{

    public static void main(String[] args) throws InterruptedException
    {
        plane plane = new plane(10);
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");

        System.out.println("the take-off time: " + plane.takeoff());

        System.out.println("the list of passengers " + plane.getPassengers());

        Thread.sleep(5000);
        plane.land();
        System.out.println("the time of landing: " + plane.getLastTimeLanded());
        System.out.println("People landed: " + plane.getPassengers());
    }
}

class plane
{
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public plane(int maxPassengers)
    {
    this.maxPassengers=maxPassengers;
    this.passengers= new ArrayList<>();
    }
    public void onboard (String passengers)
    {
        this.passengers.add(passengers);
    }
    public Date takeoff()
    {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land()
    {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded()
    {
        return lastTimeLanded;
    }
    public List<String> getPassengers()
    {
        return passengers;
    }
}
