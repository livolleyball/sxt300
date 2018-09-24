package unit_4;

/*
static 关键字  静态方法

在类中，用static 声明的成员变量为静态成员变量，也称为类变量。
类变量的生命周期和类相同，在整个应用程序执行期间都有效。

static 修饰的成员变量和方法，从属于类；
普通变量和方法从属于对象。
*/


public class TestStatic {
    int id ;
    String name;

    static String company ="beijing sxt";

    public TestStatic(int id,String name){
        this.id= id;
        this.name =name;
    }

    public void login(){
        System.out.println(name+  "登陆");
    }

    public static void  printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args){
        TestStatic user = new TestStatic(001,"Tom");
        user.printCompany();
        user.company = "shanghai sxt";
        user.printCompany();

        System.out.println("-------------------------");
        TestStatic.printCompany();
        TestStatic.company = "shanghai sxt";
        TestStatic.printCompany();

        TestStatic user2 = new TestStatic(002,"Tom");
        user2.printCompany();
    }
}


