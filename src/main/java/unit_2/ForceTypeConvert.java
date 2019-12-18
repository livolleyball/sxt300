package unit_2;
//强制类型转化，精度会丢失
// 比较大的数 容易溢出

public class ForceTypeConvert {

    public static void main(String[] var0) {
        double var1 = 3.14;
        int var2 = (int)var1;
        char var4 = 'a';
        int var6 = var4+4;
        System.out.println(var2);
        System.out.println(var6);
        String ss="2.0";
//        Integer ins=Integer.valueOf(ss);
        Integer dous=Double.valueOf(ss).intValue();
        System.out.println(dous);
    }
}