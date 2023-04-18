package activities;

import java.util.HashSet;
import java.util.Iterator;

public class Activity10
    {
        public static void main (String[] arg) {
            HashSet<String> hs = new HashSet<String>();
            hs.add("A");
            hs.add("B");
            hs.add("C");
            hs.add("D");
            hs.add("E");
            hs.add("F");
            System.out.println("Size of HashSet is " + hs.size());
            hs.remove("A");
            if (hs.contains("Z")) {
                hs.remove("Z");
                System.out.println("Z is removed from hashset");
            } else {
                System.out.println("Z is not present in list");
            }
            if (hs.contains("B")) {
                System.out.println("B is Present in Hashset");
            } else {
                System.out.println("B is not present in hashset");
            }
           Iterator<String> iterator = hs.iterator();
            System.out.println("Updated list is below");
            while (iterator.hasNext())
                System.out.println(iterator.next());
        }
    }
