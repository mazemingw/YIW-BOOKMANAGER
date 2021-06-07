package cn.yiwubooks.view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class REG {
	
	public static  void main(String[] args) {
		JFrame f = new  JFrame("注册");
		    f.setResizable(true);
	        f.setSize(1340,770);
	        f.setLocation(250,172);
	        f.setLayout(null);
	        f.setLocationRelativeTo(null);//居中
	        
	        JLabel bg = new JLabel(); //背景控件
	        ImageIcon bg1 = new ImageIcon("src/data/MAIN/ZCBG.png");
	        bg.setIcon(bg1);
	        bg.setBounds(0, 0,1340, 770);
	        bg.setLayout(new GridLayout(6, 1)); 

	        // 输入框
	        final JTextField banji1 = new JTextField("");
	        banji1.setText("请输入班级");
	        banji1.setBounds(550,240,270,40);
	        banji1.setFont(new Font("宋体", Font.PLAIN, 12));
	        banji1.setForeground(Color.gray);
	        banji1.setOpaque(false);
	        
	        // 输入框
	        final JTextField name1 = new JTextField("");
	        name1.setText("请输入账户名");
	        name1.setBounds(550,300,270,40);
	        name1.setFont(new Font("宋体", Font.PLAIN, 12));
	        name1.setForeground(Color.gray);
	        name1.setOpaque(false);
	        
	        // 输入框
	        final JTextField password1 = new JTextField("");
	        password1.setText("请输入密码");
	        password1.setBounds(550,360,270,40);
	        password1.setFont(new Font("宋体", Font.PLAIN, 12));
	        password1.setForeground(Color.gray);
	        password1.setOpaque(false);
	        
	        
	        final JTextField password2 = new JTextField("");
	        password2.setText("请再次输入密码");
	        password2.setBounds(550,420,270,40);
	        password2.setFont(new Font("宋体", Font.PLAIN, 12));
	        password2.setForeground(Color.gray);
	        password2.setOpaque(false);
	        
	        banji1.addMouseListener(new MouseAdapter() {
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					 banji1.setText("");
				}});
	        
	        name1.addMouseListener(new MouseAdapter() {
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					 name1.setText("");
				}});
	        
	        password1.addMouseListener(new MouseAdapter() {
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					  password1.setText("");
				}});
	        
	        password2.addMouseListener(new MouseAdapter() {
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					  password2.setText("");
				}});
	        
	        final JLabel biaoti = new JLabel("已有账号？立即登录");
	        biaoti.setForeground(Color.blue);
	        biaoti.setFont(new Font("黑体", Font.PLAIN, 14));
	        biaoti.setBounds(610, 500, 130, 100); 
	        biaoti.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        biaoti.addMouseListener(new MouseAdapter() {
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					 Login.main(null);
				}});
	        
	        
	        
	        final JLabel C = new JLabel();	
	        final JLabel E = new JLabel();
	        final JLabel duandinglan = new JLabel();   
	        
	        ImageIcon B1 = new ImageIcon("src/data/MAIN/ztopbarM.png");//短顶栏
	        ImageIcon C1 = new ImageIcon("src/data/LOGIN/zloginblock0.png");//登录框不发光
		    ImageIcon E1 = new ImageIcon("src/data/MAIN/ZCBTN1.png");//登录btn不安下
		    
		    C.setIcon(C1);
		    E.setIcon(E1);
		    duandinglan.setIcon(B1);
		    
		    duandinglan.setBounds(0,0,1366,60);//短顶栏
		    
		    C.setBounds(480,150,400,456);//登录框
		    
		    E.setBounds(550,480,270,40);//登录btn
		    E.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    E.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
				
			    }
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					
					 if(password1.getText().equals(password2.getText())){
						
	            	    }else{
	            	JOptionPane.showMessageDialog(null, "两次输入密码不一致");
	            	    }

					try {
						Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
						String url = "jdbc:mysql://8.129.174.219:3306/bookstore";//定义连接字符串url test是数据库名称
						Connection conn =DriverManager.getConnection(url,"root","root");//与数据库连接
						
						 String banji = banji1.getText();
						 String mingzi = name1.getText();					           
				         String mima = password1.getText();
						
				         
						
						String sql="insert into user1 (mingzi,mima,banji) values ('"+mingzi+"', '"+mima+"', '"+banji+"')";//sql语句
						PreparedStatement pstmt=conn.prepareStatement(sql);//获得预置对象
						
						
						
					
						
						int res=pstmt.executeUpdate();//执行sql语句
						if(res>0){
							JOptionPane.showMessageDialog(null, "如果没有提示密码问题则注册成功！请在下一个窗口登录");
							Login.main(null);
						}
						pstmt.close();//关闭资源
						conn.close();//关闭资源
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			 
				}    
				}
		    );
		     
		   
		 
		
		    
	
		   

	
		 
		    f.add(biaoti);
		    f.add(E);
		    
		    f.add(name1); 
		    f.add(banji1);
		    f.add(password1); 
		    f.add(password2); 
		    f.add(duandinglan);
		    f.add(C);
		    f.add(bg);
	

	        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	        f.setVisible(true);
}
	}
