

public class Encap1 
{
    private int age;
    private String name;
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName( String peru)
    {
        name = peru;
    }

}

class Demo
{
    public static void main(String[] args) {
        Encap1 obj = new Encap1();
        obj.setAge(20);
        obj.setName("Abhi");
        obj.getAge();
        obj.getName();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
