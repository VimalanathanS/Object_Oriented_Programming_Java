// This is a simple Java program that demonstrates creating a class, 
// instantiating an object, and calling a method to print "Hello, World!" 
// to the console. It highlights the basic structure of a Java program 
// with a main method and a user-defined method.
public class SampleClass 
//creating a class named "SampleClass"
{
    public static void main(String args[])
    {
        SampleClass obj=new SampleClass(); //Creating a object for the class         
        obj.display();   
        // Calling the 'display' method using the object 'obj'.
        // The method will print a message to the console.
    }
    // 'display' method: A user-defined method that prints "Hello, World!" 
    // to the console when invoked. This method does not take any parameters 
    // and does not return any value.
    void display()
    {
        System.out.println("Hello, World!");    
    }
}