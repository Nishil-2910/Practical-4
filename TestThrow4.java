package Nishil;

public class TestFinallyBlock
{
    public static void main(String args[]){
        try{

            int data=25/5;
            System.out.println(data);
        }

        catch(NullPointerException e){
            System.out.println(e);
        }

        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");
        System.out.println("This Program is made by 21ce101");
    }

}




public class TestThrow4

{
    public static void main(String args[])
    {
        try
        {

            throw new UserDefinedException("This is user-defined exception");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Caught the exception");

            System.out.println(ude.getMessage());
            System.out.println("This Program is made by 21CE101");
        }
    }
}
