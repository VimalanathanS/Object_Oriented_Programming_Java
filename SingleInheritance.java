/*
    Single Inheritance:
    Write a program where a superclass `Animal` has a method `eat()`. 
    Create a subclass `Dog` that inherits from `Animal` and adds a method `bark()`. 
    Call both methods from a `Dog` object.
 */
public class SingleInheritance
    {
    public static void main(String args[])
        {
            Dog obj=new Dog();
            obj.eat();
            obj.bark();
        }
        public static class Animal
        {
            public void eat()
            {
                System.out.println("Animal can eat");
            }
        }
        public static class Dog extends Animal
        {
            public void bark()
            {
                System.out.println("Dog can bark and bite");
            }
        }
    }