# java-basics

一个能直接运行的 Java 面向对象练习项目：用继承和多态实现几何图形的面积计算与比较。

## 这是什么

- 抽象父类 `GeometricObject` 定义"所有图形都有颜色、重量、面积"
- 子类 `Circle`、`MyRectangle` 各自实现 `findArea()`
- `App` 用一个 `GeometricObject[]` 数组同时装两种子类对象，遍历打印、比较面积
- `GeometryCompare` 是工具类，演示静态方法和浮点数安全比较

**不是什么**：不是教程复刻，也不是完整产品。它的作用是证明我能把面向对象真正用起来，而不是只会背概念。

## 运行

需要 JDK 17 或更高版本。

```bash
./run.sh
```

等价的手动命令：

```bash
mkdir -p out
javac -encoding UTF-8 -d out $(find src -name '*.java')
java -cp out practice.App
```

输出示例：

```
== 全部图形 ==
Circle       颜色=白色     重量=0.0 面积=12.566
MyRectangle  颜色=白色     重量=0.0 面积=12.000
Circle       颜色=红色     重量=1.5 面积=19.635

前两个面积相等？ false
面积较大的是：
  Circle       颜色=白色     重量=0.0 面积=12.566
```

## 目录结构

```
.
├── src/
│   └── practice/
│       ├── App.java              # 入口，多态演示
│       └── geometry/
│           ├── GeometricObject.java   # 抽象父类
│           ├── Circle.java            # 圆
│           ├── MyRectangle.java       # 矩形
│           └── GeometryCompare.java   # 比较工具
├── docs/
│   └── ROADMAP.md                # 下一步做什么
├── run.sh
└── .gitignore
```

## 已经踩过并改掉的坑

- `double` 用 `==` 比较面积 → 改成 `Math.abs(a - b) < 1e-6`
- 圆周率写死 `3.14` → 改用 `Math.PI`
- 父类 `findArea()` 返回 `0.0` 假装是"默认实现" → 改成 `abstract`，让子类必须实现
- 比较方法的返回值没人用 → 现在真正参与输出

## 学习进度

大二上，正在学 Java 面向对象（多态）、数据结构（二叉树）。这个仓库会持续更新。

## 下一步

见 [docs/ROADMAP.md](docs/ROADMAP.md)。
