package dsh.learning.java.exercise1;

public class Person {
    private String name;
    private int age;
    public String type = "人";
    static int count = 0;

    public Person(String name, int age) {
        count++;
        System.out.println("Person 构造器执行");
        this.name = name;
        this.age = age;
    }

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

    public void say() {
        System.out.println("姓名：" + name + "  年龄：" + age);
    }

    public final void idCard() {
        System.out.println("我是本校人员");
    }
}
