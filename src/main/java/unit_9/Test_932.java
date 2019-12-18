package unit_9;

/*
 ArrayList底层是用数组实现的存储。 特点：查询效率高，增删效率低，线程不安全
*/

public class Test_932 {

/*
    数组长度是有限的，而ArrayList是可以存放任意数量的对象，长度不受限制，那么它是怎么实现的呢?
    本质上就是通过定义新的更大的数组，将旧数组中的内容拷贝到新数组，来实现扩容。
    ArrayList的Object数组初始化长度为10，如果我们存储满了这个数组，需要存储第11个对象，
    就会定义新的长度更大的数组，并将原数组内容和新的元素一起加入到新数组中
    */
}
