package unit_8;

import java.io.File;
import java.util.Date;

public class Test_851_File {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        File f = new File("a.txt"); //相对路径：默认放到user.dir目录下面
        f.createNewFile();//创建文件

//        File f2 = new File("d:/b.txt");//绝对路径
//        f2.createNewFile();

        File f1 = new File(System.getProperty("user.dir") + "/src/main/java/unit_8/Test_851_File.java");
        System.out.println("File是否存在："+f1.exists());
        System.out.println("File是否是目录："+f1.isDirectory());
        System.out.println("File是否是文件："+f1.isFile());
        System.out.println("File最后修改时间："+new Date(f1.lastModified()));
        System.out.println("File的大小："+f1.length());
        System.out.println("File的文件名："+f1.getName());
        System.out.println("File的目录路径："+f1.getPath());
    }
}
