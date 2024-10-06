public class EncapsulationDemo1
{
    public static void main(String args[])
    {
        EncapsulationDemo2 obj=new EncapsulationDemo2();
        obj.setName("John");
        obj.setAge(21);
        System.out.println("Name :"+obj.getName());
        System.out.println("Name :"+obj.getAge());
    }
}