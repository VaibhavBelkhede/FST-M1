package activities;


public class Activity7
{
    public static void main(String args[])
    {
        mountainbike mb = new mountainbike(4, 10, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
    interface BicycleParts
    {
    public int gears=0;
    public int speed=0;
    }
    interface BicycleOperations
    {
        public void applyBrake (int decrement);
        public void speedUp(int increment);
    }
    class Bicycle implements BicycleParts,BicycleOperations
    {
        public int gears;
        public int speed;
        public Bicycle (int gears,int speed)
        {
            this.gears=gears;
            this.speed=speed;
        }

        public void applyBrake (int decrement)
        {
            speed -=decrement;
            System.out.println("Speed after brake apply"+ speed);
        }
        public void speedUp(int increment)
        {
            speed +=increment;
        }
        public String bicycleDesc()
        {
        return ("No of gears:"+gears+"\nspeed of bicycle is"+speed);
        }


    }
    class mountainbike extends Bicycle
    {
        public int seatheight;

        public mountainbike(int gears, int speed,int startheight)
        {
            super(gears, speed);
            seatheight=startheight;
        }
        public void setSeatheight(int newseat)
        {
            seatheight=newseat;
            System.out.println("testseat"+seatheight+"testnewseat"+newseat);
        }

        @Override
        public String bicycleDesc() {
            return (super.bicycleDesc()+"\nseat height is:"+seatheight);
        }
    }


