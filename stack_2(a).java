import java.util.Scanner;
interface MyStack
{
    public void pop();
    public void push();
    public void display();
}
class StackArray implements MyStack
{
    final static int n=5;
    int stack[]=new int[n];
    int top=-1;

    public void push()
    {
        Scanner in;
        try
        {
            in=new Scanner(System.in);
            if(top==(n-1))
            {
                System.out.println(" Stack Overflow");
                return;
            }
            else
            {
                System.out.println("Enter the element");
                int ele=in.nextInt();
                stack[++top]=ele;
            }
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
    }

    public void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return;
        }
        else
        {
            int popper=stack[top];
            top--;
            System.out.println("Popped element:" +popper);
        }
    }
    public void display()
    {
        if(top<0)
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
            String str=" ";
            for(int i=0; i<=top; i++)
                str=str+" "+stack[i]+" -->";
            System.out.println("Elements are:"+str);
        }
    }
}
class StackAdt
{
    public static void main(String arg[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Implementation of Stack using Array");
        StackArray stk=new StackArray();
        int ch=0;
        do
        {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            System.out.println("Enter your choice:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    stk.push();
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
        while(ch<4);
    }
}
