package cn.yiwubooks.dao6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnection {


private static Connection conn;
public static Connection getConn() {
   String driverName = "com.mysql.jdbc.Driver";
   
   String url = "jdbc:mysql://8.129.174.219:3306/bookstore";
   String userName = "root";
   String pwd = "root";
   //ps=ct.prepareStatement("select * from reader");
   try {
    Class.forName(driverName);
    conn = DriverManager.getConnection(url, userName, pwd);
   } catch (ClassNotFoundException e) {
    System.out.println("װ����������");
   } catch (SQLException e) {
    System.out.println("��ȡ���ݿ����ӳ���");
    e.printStackTrace();
   }

   return conn;
}
}

