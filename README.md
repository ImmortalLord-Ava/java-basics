# java-basics

Java 面向对象练手仓库。跟着课程（尚硅谷 OOP 部分）做的练习，每个 exercise 是一道题，代码能直接编译运行。

## 怎么跑

需要 JDK 17+。在项目根目录：

```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out dsh.learning.java.exercise4.MarketTest
```

Windows（cmd）把 `$(find src -name "*.java")` 换成：

```cmd
for /r src %i in (*.java) do @echo %i > sources.txt
javac -encoding UTF-8 -d out @sources.txt
```

## 目录

```
src/
├── Main.java                          入口模板
├── com/atguigu/practice/              继承 + 抽象类 + 多态（几何图形面积）
└── dsh/learning/java/
    ├── demo/                          构造器执行顺序演示（super / this 串联）
    ├── exercise1/                     继承基础：Person / Student / Teacher
    ├── exercise2/                     构造器与重写：Animal / Cat / Dog
    ├── exercise3/                     车辆信息：字段初始化的时机
    └── exercise4/                     收银系统：多态 + 向下转型 + 统计
```

## 每道练习在练什么

| 练习 | 关键点 |
|---|---|
| exercise1 | 父类抽公共字段，子类加自己的；`final` 方法子类不能重写 |
| exercise2 | `super(...)` 必须是构造器第一句；`this(...)` 串构造器 |
| exercise3 | 字段初始化发生在"父类构造器之前"还是之后，打印顺序能看出来 |
| exercise4 | 父类数组装子类对象；`instanceof` 判断后再向下转型 |

## 状态

还在学，边学边加。代码以能跑、能讲清为准，不追求工程化。

## 关于注释

有些代码里的注释不是我写的，是 dsh（帮我改代码的 AI）加上去的：标出我原来写错的地方、错在哪、为什么错（形如「你原来写：… 」/ ❌/✅）。

留着它们是为了**下次回看时能直接复查**：看到一处注释，就等于看到我当时踩的那个坑。所以别当废话删掉。

