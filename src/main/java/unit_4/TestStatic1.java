package unit_4;

public class TestStatic1 {
    int id;
    String name;

    static String company;

    static {
        System.out.println("执行类的初始化工作");
        company = "shanghai sxt";
        printCompany();
    }

    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        // 没有创建对象
        // 加载类的时候，已经执行静态方法
        // 先创建类 ，再构造对象
        System.out.println("-------------------------");

    }
}
