package cn.yiwubooks.view;
 
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import cn.yiwubooks.view.MainAdmin;
 
public class LoginAdmin {
    public static void main(String[] args) {
        // ������
        JFrame f = new JFrame("����Ա��¼");
        f.setResizable(false);
 
        // ���������ô�С
        f.setLocationRelativeTo(null);//����
        f.setSize(1155, 768);
        JLabel bg = new JLabel(); //�����ؼ�
        ImageIcon bg1 = new ImageIcon("src/data/LOGIN/abg.png");
        bg.setIcon(bg1);
        bg.setBounds(0, 0,1155, 768);
        bg.setLayout(new GridLayout(6, 1)); 
 
        // ����������λ��
        f.setLocation(330,172);
 
        // �������е��������Ϊ���Զ�λ
        f.setLayout(null);
 
        
        final JTextField name1 = new JTextField("");
        name1.setText("dashen");
        name1.setBounds(460, 290, 250, 38);
        name1.setFont(new Font("����", Font.PLAIN, 12));
        name1.setForeground(Color.gray);
        name1.setOpaque(false);
        
        final JTextField password1 = new JTextField("");
        password1.setText("thisispassword");
        password1.setBounds(460, 340, 250, 38);
        password1.setFont(new Font("����", Font.PLAIN, 12));
        password1.setForeground(Color.gray);
        password1.setOpaque(false);
        
        name1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
		
			}
			@Override //mouse move out
		    public void mouseExited(MouseEvent e) {
		
		    }
			@Override //mouse clicked
		    public void mousePressed(MouseEvent e) {
				name1.setText("");
		    }});
        
        password1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
		
			}
			@Override //mouse move out
		    public void mouseExited(MouseEvent e) {
		
		    }
			@Override //mouse clicked
		    public void mousePressed(MouseEvent e) {
				password1.setText("");
		    }});
        
        final JLabel C = new JLabel(); 
        final JLabel D = new JLabel(); 
        final JLabel E = new JLabel(); 
        
        ImageIcon C1 = new ImageIcon("src/data/LOGIN/alogin0.png");//��¼��ť����
        ImageIcon D1 = new ImageIcon("src/data/LOGIN/alogin1.png");//��¼��ť����
        ImageIcon E1 = new ImageIcon("src/data/LOGIN/areadme.png");//�Ķ���ʾ
        
        C.setIcon(C1);
        D.setIcon(D1);
        E.setIcon(E1);
  
        // ͬʱ��������Ĵ�С��λ��
       
        C.setBounds(453, 430, 265, 45);
        E.setBounds(535, 500, 93, 23);
        
      //������
        C.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        E.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
	   C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			ImageIcon C2 = new ImageIcon("src/data/LOGIN/alogin1.png");
			C.setIcon(C2);
			}
			@Override //mouse move out
		    public void mouseExited(MouseEvent e) {
			ImageIcon C2 = new ImageIcon("src/data/LOGIN/alogin0.png");
			C.setIcon(C2);
		    }
			@Override //mouse clicked
		    public void mousePressed(MouseEvent e) {

		        try {
		            Class.forName("com.mysql.jdbc.Driver");
		            } catch (ClassNotFoundException e11) {
		            e11.printStackTrace();
		            }
		    
		        try {   Connection c = DriverManager.getConnection("jdbc:mysql://8.129.174.219:3306/bookstore","root", "root");
		                Statement s = c.createStatement();  
		               {
		            String mingzi = name1.getText();					           
		            String mima = password1.getText();
		            
		            System.out.println(mingzi);
		            System.out.println(mima);
		            
		            String sql = "select * from admin where name = '" + mingzi +"' and password = '" + mima+"'";
		              
		            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
		            ResultSet rs = s.executeQuery(sql);
		              
		            if(rs.next())
		            	
		            MainAdmin.main(null);
		            
		            else
		            //Login.time3();
		            	JOptionPane.showMessageDialog(null, "�˺Ż��������");
		             
		        }}catch (SQLException e1) {
		            // TODO Auto-generated catch block
		            e1.printStackTrace();
		        }
		    
	}
	}
);
 
				
	   
	   E.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
		
			}
			@Override 
		    public void mouseExited(MouseEvent e) {
		    }
			@Override //mouse clicked
		    public void mousePressed(MouseEvent e) {
				linktips();
				BASE.main(null);

			}
			private void linktips() {
				
				
			} } );
 
        // �Ѱ�ť���뵽��������
	   f.add(name1);
	   f.add(password1);
	   f.add(E);
        f.add(C);
        f.add(D);
        f.add(bg);
 
        // �رմ����ʱ���˳�����
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // �ô����ÿɼ�
        f.setVisible(true);
 
    }
}