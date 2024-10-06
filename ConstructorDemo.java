/*
    This program demonstrates the use of constructors in Java, including a default constructor,
    a parameterized constructor, and a copy constructor. It shows how to initialize objects and 
    pass parameters to constructors, as well as how to create a new object from an existing one.
*/
public class ConstructorDemo 
{
    ConstructorDemo()
    {
        System.out.println("This is a Default Constructor");
    }
    ConstructorDemo(String x)
    {
        System.out.println(x);
    }
    ConstructorDemo(ConstructorDemo obj)
    {
        System.out.println("This is copy constructor");
    }
    public static void main(String args[])
    {
        String s="This is a parameterized constructor";
        ConstructorDemo obj1 = new ConstructorDemo(); // Calls the default constructor
        ConstructorDemo obj2 = new ConstructorDemo(s); // Calls the parameterized constructor
        ConstructorDemo obj3 = new ConstructorDemo(obj2); // Calls the copy constructor       
    }
}