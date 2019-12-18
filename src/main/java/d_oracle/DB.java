package d_oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB extends DBConnection {
    private static Connection con = null;
    private static Statement sql = null;
    private static ResultSet rs = null;


    public static void main(String[] args) throws SQLException {
        String COL1;
        String COL2;
        String COL3;
        String COL4;
        try {
            con = dbConn("oyo_dw", "eOD'F9A3q2m~om_tfCKz");
            if (con == null) {
                System.out.print("连接失败");
                System.exit(0);
            }
            sql = con.createStatement();
            rs = sql.executeQuery("select 1 from dual");
//            System.out.println(rs);
            System.out.println("COL1");
            while (rs.next()) {

                COL1 = rs.getString(1);
                System.out.println(COL1 );
            }
        } catch (Exception e) {
            e.printStackTrace();


        } finally {
            con.close();
        }
    }
}