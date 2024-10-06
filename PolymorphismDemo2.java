/*
    This program demonstrates the use of inner classes and method overloading in Java.
    The class 'PolymorphismDemo2' contains three inner classes: 's1', 's2', and 's3'.
    Each inner class has a 'Sample()' method that prints a unique message when called.
    In the 'main' method, objects of 's1', 's2', and 's3' are created and their 'Sample()' methods are called,
    showing how different behaviors are defined within the inner classes.
*/
public class PolymorphismDemo2 
{
    public static class s1
    {
        public void Sample()
        {
            System.out.println("Sample method in s1 Class");
        }
    }    
    public static class s2
    {
        public void Sample()
        {
            System.out.println("Sample method in s2 Class");
        }
    }    
    public static class s3
    {
        public void Sample()
        {
            System.out.println("Sample method in s3 Class");
        }
    }    
    public static void main(String args[])
    {
        s1 obj1=new s1();
        obj1.Sample();
        s2 obj2=new s2();
        obj2.Sample();
        s3 obj3=new s3();
        obj3.Sample();
    }
}