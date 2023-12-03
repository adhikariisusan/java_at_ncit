class Mobile
{
    String name;
    int price;
    static String Device;

    //Using Constructor
    public Mobile()
    {
        name="default";
        price=100_000;
        System.out.println("Constructor has been called");
    }
    static
    {
        Device="electronic";
        System.out.println("Static has been called");
    }
    public static void show1(Mobile obj) //indirectly passing a non static object inside a static method
    {
        System.out.println(obj.name + " : "+obj.price+" : "+Mobile.Device);
    }
}

public class staticconstructor {
    public static void main(String a23[])
    {
        Mobile mob1=new Mobile();
        Mobile.Device="electronic";
        mob1.name="Apple";
        mob1.price=1499;
        Mobile.show1(mob1); //passing value of an non static reference variable to the object to a static method

    }
}
