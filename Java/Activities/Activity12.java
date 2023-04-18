package activities;
public class Activity12 {

    public static void main (String[] arg)
    {
        Addable ad1= (num1,num2)->(num1+num2);
        System.out.println(ad1.add(10,20));

        Addable ad2=(num1,num2)->{
            return (num1+num2);
        };
        System.out.println(ad2.add(50,50));
    }
}
interface Addable
{
    public int add(int num1,int um2);
}
