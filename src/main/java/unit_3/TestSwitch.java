package unit_3;

//switch(expression){
//        case value :
//        //语句
//        break; //可选
//        case value :
//        //语句
//        break; //可选
////你可以有任意数量的case语句
//default : //可选
//        //语句
//        }

public class TestSwitch {
    public static void main(String args[]){
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("及格");
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}
