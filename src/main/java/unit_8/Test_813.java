package unit_8;

/*
自动装箱(autoboxing)/拆箱(unboxing)
*/

public class Test_813 {
    public static void main(String[] args) {
        Integer i1 = 100;//自动装箱
        //相当于编译器自动为您作以下的语法编译：
        Integer i11 = Integer.valueOf(100);//调用的是valueOf(100)，而不是new Integer(100)

        Integer i = null;
        int j = i;  //NullPointerException
        //示例8-5的代码在编译时期是合法的，但是在运行时期会有错误，因为其相当于：
        Integer i2 = null;
        int j2 = i.intValue();
    }
}
