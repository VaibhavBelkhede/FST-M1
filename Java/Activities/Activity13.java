package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexgen =new Random();
        System.out.print("Enter Number");
        System.out.println(" And enter any char and press enter to exit");
        while (scan.hasNextInt())
        {
            list.add(scan.nextInt());
        }

        Integer num[] = list.toArray(new Integer[0]);
        int index = indexgen.nextInt(num.length);
        System.out.println("Index value"+index);
        System.out.println("array value"+num[index]);
        scan.close();
    }
}
