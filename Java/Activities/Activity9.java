package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] arg)
    {
        ArrayList<String> Mylist = new ArrayList<String>();
        Mylist.add("Red");
        Mylist.add("Blue");
        Mylist.add("Green");
        Mylist.add("Orange");
        Mylist.add("White");

        for(String s:Mylist)
        {
            System.out.println(s);
        }
        System.out.println("3rd name in the ArrayList is "+Mylist.get(2));
        if (Mylist.contains("Blue")) {
            System.out.println("list contains blue");
        }
        else
        {
            System.out.println("List do not contain Blue");
        }
        System.out.println("Array list Size is "+Mylist.size());
        Mylist.remove(2);
        System.out.println("New Array list Size is "+Mylist.size());

    }
}
