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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginEMP {

	public static  void main(String[] args) {
		   JDialog f = new  JDialog();
		   f.setResizable(false);
	        f.setSize(1340,770);
	       f.setLocation(250,172);
	        f.setLayout(null);
	        f.setLocationRelativeTo(null);//����

	        JLabel bg = new JLabel(); //�����ؼ�
	        ImageIcon bg1 = new ImageIcon("src/data/LOGIN/elbg.png");
	        bg.setIcon(bg1);
	        bg.setBounds(0, 0,1340, 770);
	        bg.setLayout(new GridLayout(6, 1)); 
	        //1���������  2�����붥��  3������ 4.�߶�
	        
	        final JLabel biaoti = new JLabel("��ӭ��½һ�����EMPϵͳ");
	        biaoti.setForeground(Color.white);
	        biaoti.setFont(new Font("����", Font.PLAIN, 38));
	        biaoti.setBounds(420, 00, 600, 150);
	        
	        // �����
	        final JTextField name1 = new JTextField("");
	        name1.setText("emp");
	        name1.setBounds(520,360,270,40);
	        name1.setFont(new Font("����", Font.PLAIN, 12));
	        name1.setForeground(Color.gray);
	        name1.setOpaque(false);
	        // �����
	       
	        final JTextField password1 = new JTextField("");
	        password1.setText("emp");
	        password1.setBounds(520,410,270,40);
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
	        final JLabel F = new JLabel();
	        final JLabel G = new JLabel();
	        final JLabel H = new JLabel();
	        final JLabel I = new JLabel();
	        final JLabel J = new JLabel();
	        final JLabel K = new JLabel();
	        final JLabel L = new JLabel();
		    ImageIcon C1 = new ImageIcon("src/data/LOGIN/eloginblock0.png");//��¼�򲻷���
		    ImageIcon D1 = new ImageIcon("src/data/LOGIN/eloginbutton1.png");//��¼�򷢹�
		    ImageIcon E1 = new ImageIcon("src/data/LOGIN/eloginbutton0.png");//��¼btn������
		    
		    C.setIcon(C1);
		    D.setIcon(D1);
		    E.setIcon(E1);
		    
		  
		  
		    C.setBounds(450,150,400,456);//��¼��
		    C.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/eloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/eloginblock0.png");
				C.setIcon(C2);
			    }
				}
		    );

	       
		    E.setBounds(520,470,270,40);//��¼btn
		    E.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    E.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon E2 = new ImageIcon("src/data/LOGIN/eloginbutton1.png");
				E.setIcon(E2);
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/eloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
				ImageIcon E2 = new ImageIcon("src/data/LOGIN/eloginbutton0.png");
				E.setIcon(E2);
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
					            
					            String sql = "select * from employees where name = '" + mingzi +"' and password = '" + mima+"'";
					              
					            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
					            ResultSet rs = s.executeQuery(sql);
					              
					            if(rs.next())
					            	
					            MainEMP.main(null);
					            else
					            	JOptionPane.showMessageDialog(null, "�˺Ż��������");
					             
					        }}catch (SQLException e1) {
					            // TODO Auto-generated catch block
					            e1.printStackTrace();
					        }
					    
				}
				}
		    );
		     
		    

		   
		  
		    

		    f.add(G);
		    f.add(H);
	        f.add(I);
		    f.add(name1);
	        f.add(password1); 
	        f.add(F);
	        f.add(E);
	        f.add(C);
	        
	        f.add(biaoti);
	        f.add(J);
	        f.add(K);
	        f.add(L);
	        f.add(bg);

	        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	        f.setVisible(true);
	        password1.grabFocus();   
	 }
}
