package cn.yiwubooks.dao5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class DaoImpl implements DaoInterface {


/**
 */
public List getList() {
   Connection conn = JDBConnection.getConn();
   String s1 = "select * from jieyue order by id asc"; //用学号排序
   PreparedStatement ps = null;
   ResultSet rs = null;
   List list = new ArrayList();
   try {
    ps = conn.prepareStatement(s1);
    rs = ps.executeQuery();
   } catch (SQLException e) {
    System.out.println("取出全部数据出错！");
    JOptionPane.showMessageDialog(null, "取出全部数据出错!");
    e.printStackTrace();
   }
   try {
    while (rs.next()) {
     ProductBean p = new ProductBean();
     p.setProduct_id(rs.getInt(1));
     p.setProduct_name(rs.getString(2));
     p.setProduct_desc(rs.getString(3));
     p.setProduct_status(rs.getString(4));
     list.add(p);
    }
   } catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "取出全部数据出错!");
    e.printStackTrace();
   } finally {
    try {
     rs.close();
     ps.close();
     conn.close();
    } catch (SQLException e) {
     JOptionPane.showMessageDialog(null, "关闭数据连接时出错!");
     e.printStackTrace();
    }
   }
   return list;
}

public void saveList(List list) {
   String s1 = "";
   Connection conn = JDBConnection.getConn();
   PreparedStatement ps = null;
   try {
    Iterator it = list.iterator();
    while (it.hasNext()) {
     ProductBean p = (ProductBean) it.next();
     String name = p.getProduct_name();
     String desc = p.getProduct_name();
     String status = p.getProduct_status();
     int id = p.getProduct_id();
     s1 = "insert into jieyue(name,books,number) values(?,?,?)";
     ps = conn.prepareStatement(s1);
     ps.setString(1, name);
     ps.setString(2, desc);
     ps.setString(3, status);
     ps.executeUpdate();
    }
   } catch (SQLException e) {
    System.out.println("添加数据时出错！");
    JOptionPane.showMessageDialog(null, "添加数据时出错!");
    e.printStackTrace();
   } finally {
    try {
     ps.close();
     conn.close();
    } catch (SQLException e) {
     JOptionPane.showMessageDialog(null, "关闭数据连接时出错!");
     e.printStackTrace();
    }
   }
}

public void deleteList(List list) {
   String str = "delete from jieyue where id=?";
   int id = 0;
   Iterator it = list.iterator();
   Connection conn = JDBConnection.getConn();
   PreparedStatement ps = null;
   try {
    while (it.hasNext()) {
     id = ((ProductBean) it.next()).getProduct_id();
     ps = conn.prepareStatement(str);
     ps.setInt(1, id);
     ps.executeUpdate();
    }
   } catch (SQLException e) {
   } finally {
    try {
     ps.close();
     conn.close();
    } catch (SQLException e) {
     JOptionPane.showMessageDialog(null, "关闭数据连接时出错!");
     e.printStackTrace();
    }
   }
}

public void update(List list) {
   Connection conn = JDBConnection.getConn();
   PreparedStatement ps = null;
   Iterator it = list.iterator();
   int id = 0;
   int col = 0;
   String value = "";
   String str = "";
   try {
    while (it.hasNext()) {
     ChangedProduct ch = (ChangedProduct) it.next();
     id = ch.getId();
     col = ch.getCol();
     value = ch.getValue();
     switch (col) {
     case 1:
      str = "update jieyue set books=? where id=?";
      break;
     case 2:
      str = "update jieyue set books=? where id=?";
      break;
     case 3:
      str = "update jieyue set books=? where id=?";
     }
     ps = conn.prepareStatement(str);
     ps.setString(1, value);
     ps.setInt(2, id);
     ps.executeUpdate();
    }
   } catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "修改数据时出错!");
    e.printStackTrace();
   } finally {
    try {
     ps.close();
     conn.close();
    } catch (SQLException e) {
     JOptionPane.showMessageDialog(null, "关闭数据连接时出错!");
     e.printStackTrace();
    }
   }
}
}

