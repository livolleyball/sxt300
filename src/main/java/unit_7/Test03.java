package unit_7;

public class Test03 {
    public static void main(String[] args) {
        int[] a = new int[4];
        //初始化数组元素的值
        for(int i=0;i<a.length;i++){
            a[i] = 100*i;
        }
        //读取元素的值
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        // 7.3.2 for-each 循环
        String[] ss={"aa", "bbb", "ccc", "ddd"};
        for (String temp : ss){
            System.out.println(temp);
        }

        // 数组的copy
        String[] s = {"阿里","尚学堂","京东","搜狐","网易"};
        String[] sBak = new String[6];

        System.arraycopy(s,0,sBak,0,s.length);
        for (int i = 0; i < sBak.length; i++) {
            System.out.print(sBak[i]+ "\t");
        }
    }
}
