package example;

public class bitCal {


//    用最有效率的方法算出2乘以8等于多少
//    使用位运算来实现效率最高。位运算符是对操作数以二进制比特位为单位进行操作和运算，操作数和结果都是整型数。
//    对于位运算符“<<”, 是将一个数左移n位，就相当于乘以了2的n次方，那么，一个数乘以8只要将其左移3位即可，
//    位运算cpu直接支持的，效率最高。所以，2乘以8等于几的最效率的方法是2 << 3

    public static int setIndexZero(int num ,int index){
        int i=num<<index;
        return i;
    }

    //位用算方法是否为偶数
    public static boolean isOdd(int i){
        return (i & 1) != 0;
    }


    public static void main(String[] args) {
        System.out.println(setIndexZero(2,3));
        System.out.println(isOdd(3));
    }

}
