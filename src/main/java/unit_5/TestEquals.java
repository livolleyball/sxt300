package unit_5;

/*
==”代表比较双方是否相同。如果是基本类型则表示值相等，如果是引用类型则表示地址相等即是同一个对象。

Object 的 equals 方法默认就是比较两个对象的hashcode，是同一个对象的引用时返回 true 否则返回 false。

*/

public class TestEquals {
    public static void main(String[] args) {
        Person02 p1 = new Person02(123, "Tom");
        Person02 p2 = new Person02(123, "Tom1");
        System.out.println(p1 == p2);     //false，不是同一个对象
        System.out.println(p1.equals(p2));  //true，id相同则认为两个对象内容相同
        String s1 = new String("sxt");
        String s2 = new String("sxt");
        String s3 = s1;
        System.out.println("s1 与 s2: " + ( s1 == s2));         //false, 两个字符串不是同一个对象
        System.out.println("s1 与 s2: " + s1.equals(s2));  //true,  两个字符串内容相同

        System.out.println("s1 与 s3: " + (s1 == s3));         //true, 两个字符串是同一个对象
        System.out.println("s1 与 s3: " + s1.equals(s3));  //true,  两个字符串内容相同
    }
}

class Person02 {
    int id;
    String name;

    public Person02(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof Person02) {
                Person02 c = (Person02) obj;  // 强制转型
                if (c.id == this.id) {
                    return true;
                }
            }
        }
        return false;
    }
}