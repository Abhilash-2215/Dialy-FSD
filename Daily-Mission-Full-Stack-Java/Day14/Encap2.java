public class Encap2 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Demo {
    public static void main(String[] args) {
        Encap2 obj = new Encap2();
        obj.setAge(20);
        obj.setName("Abhi");

        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
    }
}
