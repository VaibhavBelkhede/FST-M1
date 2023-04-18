package activities;

public class Activity5 {

    public static void main(String [] arg)
    {
        MyBook newnovel = new MyBook();
        String Title= "Rich Dad Poor Dad";
        newnovel.setTitle(Title);
        System.out.println("Title of book is "+newnovel.getTitle());
    }

}
abstract class Book
{
    String Title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return Title;
    }

}

class MyBook extends Book
{
    public void setTitle(String s)
    {
    Title=s;
    }
}