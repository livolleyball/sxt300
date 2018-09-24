package unit_5;

public class Person4Encapsulation {
    // 属性一般使用private修饰
    private String name;
    private int age;
    private boolean flag;

    //    注释掉 构造方法
//    public Person4Encapsulation(String name, int age) {
//        this.name = name;
//        // this.age = age;//构造方法中不能直接赋值，应该调用setAge方法
//        setAge(age);
//    }

    // 为属性提供public修饰的set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //在赋值之前先判断年龄是否合法
        if (age > 130 || age < 0) {
            this.age = 18;//不合法赋默认值18
        } else {
            this.age = age;//合法才能赋值给属性age
        }
    }

    public boolean isFlag() {// 注意：boolean类型的属性get方法是is开头的
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
