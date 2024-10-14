/*
  Hierarchical Inheritance
- Create a `Vehicle` class with a `start()` method.
- Create two subclasses: `Car` with a `drive()` method and `Bike` with a `ride()` method.
- Demonstrate by creating objects of `Car` and `Bike` and calling `start()` along with their own methods (`drive()` and `ride()`).
*/
public class HierarchicalInheritance
{
   public static void main(String args[])
    {
        new Bike().ride();
        new Car().drive();
    }
    public static class Vechile
    {
        public void start()
        {
            System.out.println("You can ride a vechile");
        }
    }
    public static class Bike extends Vechile
    {
        public void ride()
        {
            start();
            System.out.println("Riding the bike");
        }
    }
    public static class Car extends Vechile
    {
        public void drive()
        {
            start();
            System.out.println("Driving a car");
        }
    }
}