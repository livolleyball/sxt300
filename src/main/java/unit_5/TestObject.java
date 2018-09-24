package unit_5;

public class TestObject {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.age = 20;
        p.name = "李东";
        System.out.println("info:" + p);
        System.out.println("info:" + p.toString());

        TestObject t = new TestObject();
        System.out.println(t); // 类名+@+16进制的hashcode
    }

}

class Person2 {
    String name;
    int age;

    @Override
    public String toString() {
        return name + ",年龄：" + age;
    }
}