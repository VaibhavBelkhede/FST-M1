package activities;

public class Activity8
{
    public static void main (String[] arg)
    {
    try {
        Activity8.exceptionTest("will print in ");
        Activity8.exceptionTest(null);
        Activity8.exceptionTest("Won't execute");
    }
    catch (CustomException mea)
    {
        System.out.println("catch block"+ mea.getMessage());
    }

    }
    static void exceptionTest(String str) throws CustomException {
        if (str == null) {
            throw new CustomException("Srting value is null");
        } else {
            System.out.println(str);
        }
    }
}
class CustomException extends Exception
{
    private String message = null;

    public CustomException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
