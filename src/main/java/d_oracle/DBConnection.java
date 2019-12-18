package d_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection dbConn(String name, String pass) {
        Connection c = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 要是导入驱动没有成功的话都是会出现classnotfoundException.自己看看是不是哪里错了,例如classpath这些设置
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            c = DriverManager.getConnection(

//                    oracle+cx_oracle://oyo_dw:eOD\'F9A3q2m~om_tfCKz@10.200.71.247:1521/oyodw
                    "jdbc:oracle:thin:@10.200.71.247:1521:oyodw", name, pass);
            // 连接数据的方法有四种, 这个属于最简单的,一般用网页程序 chenh是你的数据库实例名称，在下载的文件test.sql中可以执行语句查看
            // "jdbc:oracle:thin:@计算机名称:监听端口:系统实例名", username, password,
            // 计算机名称,要是自己不知道可以在计算机属性查知.
            // 监听端口一般默认是1521, 要是改变了就看自己的监听文件listener.ora
            // 系统实例名一般是默认orcl, 要是不是的话就用 select name from v$database; 看看当前的实例名.在本程序中我更改了实例为chenh
            // username,password,就是登陆数据库的用户名和密码.


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
}