 /*
    This program demonstrates compile-time polymorphism through method overloading.
    The class 'PolymorphismDemo' has three overloaded 'Add' methods that handle different tasks:
    1. Adding two integers.
    2. Adding three integers.
    3. Printing a message with a string and an integer.
    The correct method is chosen based on the number and types of arguments passed.
 */
public class PolymorphismDemo1 
{
    public static void main(String args[])
    {
        PolymorphismDemo1 obj=new PolymorphismDemo1();
        obj.Add(1,2);
        obj.Add(1,2,3);
        obj.Add("John",21);
    }   
    public void Add(int i,int j)
    {
        System.out.println("Addition of "+i+" + "+j+" : "+(i+j));
    }
    public void Add(int i,int j,int k)
    {
        System.out.println("Addition of "+i+" + "+j+" "+k+" : "+(i+j+k));
    }
    public void Add(String s,int n)
    {
        System.out.println(s+" is "+n+" years old");
    }    
}