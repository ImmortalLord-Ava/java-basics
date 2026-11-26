package dsh.learning.java.exercise1;

public class Teacher extends Person {
    private String title;

    public Teacher(String name, int age, String title) {
        super(name, age);
        System.out.println("Teacher 构造器执行");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void say() {
        System.out.println("姓名：" + getName() + "  年龄：" + getAge() + "  职称：" + title);
    }
}
