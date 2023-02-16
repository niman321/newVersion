package Class26;


class Human3 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Human3 objection = new Human3();
        objection.setName("nima");
        objection.setAge(30);
        // System.out.println(objection.getName());
        // System.out.println(objection.getAge());


    }
}
