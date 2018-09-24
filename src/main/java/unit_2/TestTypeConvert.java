package unit_2;
//类型转换 ，容量低的向容量高的转化

public class TestTypeConvert{
    public static void main(String[] args){
        int a= 12;
        long b=a;
        double c=b;
//        a=b;
        byte e=12;
        System.out.println(a);
        int money=10000*10000*10;
        int year =20;
        int total = money* year;
        System.out.println("total:"+total);

        long total1= money*year;
        System.out.println("total1:"+total1);
//    先将运算的一个因子转成long, 提高整体精度
        long total2 = money*(long)year;
        System.out.println("total2:"+total2);
    }
}