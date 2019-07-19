package unit_3;

public class TestIf01 {
    public static void main(String args[]){
        int x = 10;
        String y="a";

        if( x == 20 && y.equals("a") ){
            return;
        }
        System.out.println("这是测试");

        String[] aa="a,b,c".split(",");
        System.out.println(aa.length);
    }

}
