package unit_4;

public class TestArgs {
    int id;
    String name;

    public TestArgs(int id,String name){
        this.id=id;
        this.name =name;

    }

    public void testParameterTranfer01(TestArgs tsa,String name){
        tsa.name=name;
    }

    public void testParameterTranfer02(TestArgs tsa){
        tsa = new TestArgs(102,"Tom3"); // 新建对象，地址改变，不会改变原来的对象
    }

    public static void main(String[] args){
        TestArgs tsa = new TestArgs(101,"Tom1");
        System.out.println(tsa.name);


        tsa.testParameterTranfer01(tsa,"Tom2");
        System.out.println(tsa.name);

        tsa.testParameterTranfer02(tsa);
        System.out.println(tsa.id); // 101
        System.out.println(tsa.name); // Tom3
    }

}
