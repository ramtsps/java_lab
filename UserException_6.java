import java.io.*;
import java.util.*;
class MyException extends Exception
{
    private int d;
    MyException(int a)
    {
        d = a;
    }

    public String toString()
    {
        return "MyException [" + d + "]";
    }
}
public class UserException_6
{
    static void compute(int a) throws MyException
    {
        System.out.println ("Called Compute(" + a + ")");
        if(a>10)
            throw new MyException(a);
        System.out.println ("Normal Exit");
    }
    public static void main(String args[])
    {
        try
        {
            compute(1);
            compute(20);
        }
        catch(MyException e)
        {
            System.out.println("Caught " + e);
        }
    }
}
