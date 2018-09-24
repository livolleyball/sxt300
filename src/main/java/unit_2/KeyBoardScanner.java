package unit_2;
import java.util.Scanner;

//测试键盘输入

public class KeyBoardScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的名字： ");
        String name = scanner.nextLine();
        System.out.println("请输入您的爱好： ");
        String favor = scanner.nextLine();
        System.out.println("请输入您的年龄： ");
        String age = scanner.nextLine();
        System.out.println("name:"+name+" favor:"+favor+" age:"+age);
    }
}
