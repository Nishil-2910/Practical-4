package Nishil;

public class TryCatch
{
    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
        }
        //handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        System.out.println("This program is made by 21CE101");
    }

}
