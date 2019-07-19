package unit_7;


/*  1. 声明的时候并没有实例化任何对象 (只存在与栈内存)，只有在实例化数组对象时，JVM才分配空间（分配 堆内存），这时才与长度有关。
   2. 声明一个数组的时候并没有数组真正被创建。
    3. 构造一个数组，必须指定长度。*/


class Man implements Comparable{ //Arrays.sort
    private int age;
    private int id;
    public Man(int id,int age) {
        super();
        this.age = age;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Man [id=" + id + ", age=" + age + "]";
    }
//    Comparable接口的应用
    public int compareTo(Object o) {
        Man man = (Man) o;
        if (this.age < man.age) {
            return -1;
        }
        if (this.age > man.age) {
            return 1;
        }
        return 0;
    }
}

public class Test01 {
    public static void main(String args[]) {
        int[] arr01 = new int[10];
        String[] arr02 = new String[5];


        for (int i = 0; i < 10; i++) {
            arr01[i] = i;
            System.out.println(arr01[i]);
        }

        Man[] mans;  //声明引用类型数组；
        mans = new Man[10];  //给引用类型数组分配空间；

        Man m1 = new Man(1,11);
        Man m2 = new Man(2,22);

        mans[0]=m1;//给引用类型数组元素赋值；
        mans[1]=m2;//给引用类型数组元素赋值；

    }
}
