class computation
{
    public void square(int a)
    {
        a*=a;
        System.out.println("no return type(square) has been accessed and ans is "+a);
    }
    public int multi(int a,int b)
    {
        System.out.println("return type(multiplication) has been accessed");
        return (a*b);
    }
}

public class selfprac 
{
    public static void main(String ab[])
    {
        int x=10;
        int y=30;
        computation calculate= new computation();
        System.out.println("calculate reference variable has been used");
        calculate.square(x);
        int i=calculate.multi(x,y);
        System.out.println("the answer is ="+i);

    }
    
}
