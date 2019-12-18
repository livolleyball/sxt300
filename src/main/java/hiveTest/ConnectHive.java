package hiveTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

public class ConnectHive {
    private static String driverName = "org.apache.hive.jdbc.HiveDriver";


    private static String url = "jdbc:hive2://192.168.71.236:10000/default";
    private static String user = "bigdata_etl";
    private static String password = "internal";

    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    // 加载驱动、创建连接
    @Before
    public void init() throws Exception {
        System.out.println("===============start======================");
        Class.forName(driverName);
        conn = DriverManager.getConnection(url,user,password);
        stmt = conn.createStatement();
    }

    // 查询所有表
    @Test
    public void showTables() throws Exception {
        String sql = "show create table tbjxw";
        System.out.println("Running: " + sql);
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
    }


    // 查询所有表
    @Test
    public void ss() throws Exception {
        String sql = "select * from tbjxw";
        System.out.println("Running: " + sql);
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
    }

    // 加载驱动、创建连接
    @After
    public void after() throws Exception {
        System.out.println("===============end======================");
    }

}
