class Mobile
{
    String Brand;
    int price;
    static String Device;
    
    public void show()
    {
        System.out.println(Brand + " : "+price+" : "+Device);
    }

}
public class statickey 
{
    public static void main(String a23[])
    {
        

    Mobile obj1=new Mobile();
    obj1.Brand= "apple";
    obj1.price =1500;

    Mobile obj2=new Mobile();
    obj2.Brand ="samsung";
    obj2.price =999;

    Mobile.Device ="Electronic";

    obj1.show();
    obj2.show();

}
}
