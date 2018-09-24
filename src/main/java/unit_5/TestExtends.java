package unit_5;

/*
extends的意思是“扩展”。子类是父类的扩展。

单继承
Java的接口可以多继承，类只能是单继承
子类继承父类，可以得到父类的全部属性和方法 (除了父类的构造方法)，但不见得可以直接访问(比如，父类私有的属性和方法)。
*/

/* instanceof是二元运算符，左边是对象，右边是类；当对象是右面类或子类所创建对象时，返回true；否则，返回false。*/

public class TestExtends {
    public static void main(String[] args) {
        Student stu1 = new Student("Tom", 178, "computer");
        stu1.rest();
        stu1.study();

        System.out.println(stu1 instanceof Student);
        System.out.println(stu1 instanceof Person);
        System.out.println(stu1 instanceof Object);
        System.out.println(new Person() instanceof Object);
    }
}

class Person {
    String name;
    int height;

    public void rest() {
        System.out.println("休息一会");
    }
}


class Student extends Person {
    String major;

    public void study() {
        System.out.println("学习");
    }

    public Student(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }
}