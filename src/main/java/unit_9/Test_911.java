package unit_9;

//类的声明处增加泛型列表，如：<T,E,V>。
// 此处，字符可以是任何标识符，一般采用这3个字母


public class Test_911{
    public static void main(String[] args) {
        MyCollection<String> mc=new MyCollection<String>();
        mc.set("aaa",0);
        mc.set("bbb",1);

        String str=mc.get(1);
        System.out.println(str);
    }

}


class MyCollection<E> {
    Object[] objs = new Object[5];

    // get
    public E get(int index) {// E:表示泛型;
        return (E) objs[index];
    }

    // set
    public void set(E e, int index) {// E:表示泛型;
        objs[index] = e;
    }
}
