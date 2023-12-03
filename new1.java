class calculator
{
    public int add(int a,int b,int c=0)
    {
        return (a+b+c);
    }
    

}

public class new1 
{
    public static void main(String Aaa[])
    {
        calculator obj=new calculator();
        int r=obj.add(3,4);
        int r1=ob.add(3,4,5);
        System.out.println("2 wala"+r+" 3 wala"+r1);
        
    }
    
}
