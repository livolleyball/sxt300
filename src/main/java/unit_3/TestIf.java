package unit_3;



public class TestIf {
    public static void  main(String[] agrs){
        double a= Math.random();
        System.out.println(a);
        int b = (int)(6* Math.random());
        System.out.println(b);

        if(b<=3){
            System.out.println("小");
        }
        else if(b == 4){
            System.out.println("B is "+b);
        }
        else
        {
            System.out.println("B 大于 4");
        }
    }
}
