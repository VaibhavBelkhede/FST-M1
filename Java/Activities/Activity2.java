package activities;

public class Activity2 {
    public static void main (String[] arg)
    {
        int[] numval = {10,77,10,54,-11,10};
        int i,j,k=0;
        for (i=0;i<= numval.length-1;i++)
        {
            j= numval[i];
            if(j==10)
            {
            k=(k+j);
            }
        }
        if (k==30)
        {
            System.out.println("sum of 10's array is 30");
        }
        else
        {
            System.out.println("sum of 10's array is not 30");
        }
    }
}
