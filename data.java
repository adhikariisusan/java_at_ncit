
class calculator
{
    int a;
    public int add(int a,int b)
    {
        return (a+b);
    }
}



public class data
{
    public static void main(String a1[])
        {  
            int n1=35,n2=45;
            //reference variable of class calculator
            calculator sum=new calculator();
            int s=sum.add(n1,n2);
            System.out.println(s);
        }
}