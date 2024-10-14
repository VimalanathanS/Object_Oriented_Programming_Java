/* 
  Multilevel Inheritance:
- Create a `Person` class with a `walk()` method.
- Create an `Employee` class that inherits `Person` and adds a `work()` method.
- Create a `Manager` class that inherits `Employee` and adds a `manageTeam()` method.
- Demonstrate by creating a `Manager` object and calling all three methods.
*/
public class MultilevelInheritance 
{
   public static void main(String args[])
    {
        Manager obj= new Manager();
        obj.walk();
        obj.work();
        obj.manageTeam();
    }
    public static class Person
    {
        public void walk()
        {
            System.out.println("Person can walk");
        }
    }
    public static class Employee extends Person
    {
       public void work()
        {
            System.out.println("Employee can work");
        }
    }
    public static class Manager extends Employee
    {
       public void manageTeam()
        {
            System.out.println("Manager can manage team");
        }
    }
}