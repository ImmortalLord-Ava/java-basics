package dsh.learning.java.exercise1;

public class SchoolTest {
    public static void main(String[] args) {
        // 多态的核心：左边是父类类型，右边是子类对象
        Person[] arr = {
                new Student("张三", 20, "5001", "计算机"),
                new Student("李四", 21, "5002", "软件工程"),
                new Teacher("王五", 40, "教授")
        };

        // 第 3 步：一个循环，调的是各自重写后的 say()
        for (int i = 0; i < arr.length; i++) {
            arr[i].say();
        }

        // 第 4 步：instanceof 判断 + 向下转型
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Student) {
                Student s = (Student) arr[i];      // 向下转型
                System.out.println("学号是：" + s.getNo());
            } else if (arr[i] instanceof Teacher) {
                Teacher t = (Teacher) arr[i];      // 向下转型
                System.out.println("职称是：" + t.getTitle());
            }
        }

        arr[0].idCard();
        System.out.println("count = " + Person.count);
        System.out.println("type = " + arr[0].type);

        // 第 4 关：四个问题的答案
        // 1. arr[0].type 打印「人」，因为字段不参与多态。字段看的是「变量的类型」，
        //    arr 的元素类型是 Person，所以取的是 Person 里的 type 字段。
        // 2. Student 里写 @Override public void idCard() 会编译报错，
        //    因为父类把它声明成 final，final 方法禁止被子类重写。
        // 3. 构造器上不能加 @Override。构造器不是方法，不能被继承，也就谈不上重写。
        // 4. Student 里不能直接写 name = "x";，因为 name 是父类的 private 字段，
        //    子类看不到它，只能通过父类提供的 setName() 去改。
    }
}
