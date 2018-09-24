package unit_4;
/*    引用计数法
   引用可达法（根搜索算法）*/

/*
对象分为三种状态： 年青代/年老代/持久代

垃圾回收过程
1 创建对象，大部分存在 Eden中
2 当Eden 满了（达到一定比例） 不能创建新对象，则启动GC机制，将无用对象清理掉，然后剩余对象复制到某个Survivor 中
  ，如 S1，同时清空Eden区；
3 当Eden区再次满了，会将S1 中不能清空的对象存到另一个Survivor 中，如S2；
  同时将Eden 区中不可清空的对象放到S1 中；
4 重复多次（默认15）Survivor中没有被清理的对象，则会复制到年老代 Old区中；
5 当old区满了，将会触发一个完整的垃圾回收（Full GC），之前新生代的垃圾回收称为（minorGC）；

对于JVM 的调优，很大一部分是对于 Full GC 的调节，下列情况可能会导致FullGC：
1 年老代被写满
2 持久代被写满
3 System.gc() 被显式调用（程序建议GC启动，不是调用GC）
4 上一次GC之后heap的各域分配策略动态变化
*/

public class TestGC {
}