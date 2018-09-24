package unit_4;
import java.sql.Date;
import java.util.*;//导入该包下所有的类。会降低编译速度，但不会降低运行速度。

import static java.lang.Math.PI ;// 导入Math 类的PI属性
import static java.lang.Math.*; //导入Math类的所有静态属性

public class TestImport{
    public static void main(String[] args) {
        //这里指的是java.sql.Date
        Date now;
        //java.util.Date因为和java.sql.Date类同名，需要完整路径
        java.util.Date  now2 = new java.util.Date();
        System.out.println(now2);
        //java.util包的非同名类不需要完整路径
        Scanner input = new Scanner(System.in);

        System.out.println(PI);
        System.out.println(random());
    }
}
