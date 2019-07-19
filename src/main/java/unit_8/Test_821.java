package unit_8;

/*
String 类对象代表不可变的Unicode字符序列，因此我们可以将String对象称为“不可变对象”。
 那什么叫做“不可变对象”呢?指的是对象内部的成员变量的值无法再改变。
 */

public class Test_821 {
    public static void main(String[] args) {
        String s1 = new String("abcdef");
        String s2 = s1.substring(2, 4);
        //  substring()是对字符串的截取操作，但本质是读取原字符串内容生成了新的字符串
        // 打印：ab199863
        System.out.println(Integer.toHexString(s1.hashCode()));
        // 打印：c61, 显然s1和s2不是同一个对象
        System.out.println(Integer.toHexString(s2.hashCode()));



//        在遇到字符串常量之间的拼接时，编译器会做出优化，即在编译期间就会完成字符串的拼接。
        //编译器做了优化,直接在编译的时候将字符串进行拼接
        String str1 = "hello" + " java";//相当于str1 = "hello java";
        String str2 = "hello java";
        System.out.println(str1 == str2);//true
        String str3 = "hello";
        String str4 = " java";
        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false
    }
}
