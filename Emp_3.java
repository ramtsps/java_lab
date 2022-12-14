import pay_3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Emp_3
{
    Employee e;
    ArrayList<Employee> obj= new ArrayList<>();
    Scanner get= new Scanner(System.in);
    String name, id, address, mailId, mobileNo, des;
    float bPay;
    public void addEmployee()
    {
        System.out.println("Enter the Emp_Name:");
        String name = get.next();
        System.out.println("Enter the Emp_id:");
        String id = get.next();
        System.out.println("Enter the Address:");
        String address = get.next();
        System.out.println("Enter the Mail_id:");
        String mailId = get.next();
        System.out.println("Enter the Mobile_no:");
        String mobileNo = get.next();
        System.out.println("Enter the Designation:");
        String des = get.next();
        System.out.println("Enter the Basic_Pay:");
        float bPay = get.nextFloat();
        if(des.equalsIgnoreCase("pay.Programmer"))
        {
            e= new Programmer(name, id, address, mailId, mobileNo, bPay, des);
            obj.add(e);
        }
        else if(des.equalsIgnoreCase("pay.AssistantProfessor"))
        {
            e= new AssistantProfessor(name, id, address, mailId, mobileNo, bPay, des);
            obj.add(e);
        }
        else if(des.equalsIgnoreCase("pay.AssociateProfessor"))
        {
            e= new AssociateProfessor(name, id, address, mailId, mobileNo, bPay, des);
            obj.add(e);
        }
        else if(des.equalsIgnoreCase("pay.Professor"))
        {
            e= new Professor(name, id, address, mailId, mobileNo, bPay, des);
            obj.add(e);
        }
        Employee em=new Employee(name, id, address, mailId, mobileNo);
        em.display();
    }
    public void displayEmployee()
    {
        for(Employee e:obj)
        {
            e.paySlip();
        }
    }
    public static void main(String args[]) throws IOException
    {
        Emp_3 x= new Emp_3();

        String check;
        do
        {
            x.addEmployee();

            System.out.println("Do you wnat continue press 'y'");
            check=x.get.next();
        }
        while(check.equalsIgnoreCase("y"));
        x.displayEmployee();
    }
}