package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] arg)
    {
        HashMap<Integer,String> colour = new HashMap<>();
        colour.put(1,"Red");
        colour.put(2,"Blue");
        colour.put(3,"Green");
        colour.put(4,"Orange");
        colour.put(5,"Red");
        System.out.println(colour);
        colour.remove(4);
        if(colour.containsValue("Green"))
        {
            System.out.println("Green colour Exist");
        }
        else {
            System.out.println("Green do not exist");
        }
        System.out.println("Size of hashmap is "+colour.size());
    }
}
