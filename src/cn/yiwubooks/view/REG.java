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
		JFrame f = new  JFrame("ע��");
		    f.setResizable(true);
	        f.setSize(1340,770);
	        f.setLocation(250,172);
	        f.setLayout(null);
	        f.setLocationRelativeTo(null);//����
	        
	        JLabel bg = new JLabel(); //�����ؼ�
	        ImageIcon bg1 = new ImageIcon("src/data/MAIN/ZCBG.png");
	        bg.setIcon(bg1);
	        bg.setBounds(0, 0,1340, 770);
	        bg.setLayout(new GridLayout(6, 1)); 

	        // �����
	        final JTextField banji1 = new JTextField("");
	        banji1.setText("������༶");
	        banji1.setBounds(550,240,270,40);
	        banji1.setFont(new Font("����", Font.PLAIN, 12));
	        banji1.setForeground(Color.gray);
	        banji1.setOpaque(false);
	        
	        // �����
	        final JTextField name1 = new JTextField("");
	        name1.setText("�������˻���");
	        name1.setBounds(550,300,270,40);
	        name1.setFont(new Font("����", Font.PLAIN, 12));
	        name1.setForeground(Color.gray);
	        name1.setOpaque(false);
	        
	        // �����
	        final JTextField password1 = new JTextField("");
	        password1.setText("����������");
	        password1.setBounds(550,360,270,40);
	        password1.setFont(new Font("����", Font.PLAIN, 12));
	        password1.setForeground(Color.gray);
	        password1.setOpaque(false);
	        
	        
	        final JTextField password2 = new JTextField("");
	        password2.setText("���ٴ���������");
	        password2.setBounds(550,420,270,40);
	        password2.setFont(new Font("����", Font.PLAIN, 12));
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
	        
	        final JLabel biaoti = new JLabel("�����˺ţ�������¼");
	        biaoti.setForeground(Color.blue);
	        biaoti.setFont(new Font("����", Font.PLAIN, 14));
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
	        
	        ImageIcon B1 = new ImageIcon("src/data/MAIN/ztopbarM.png");//�̶���
	        ImageIcon C1 = new ImageIcon("src/data/LOGIN/zloginblock0.png");//��¼�򲻷���
		    ImageIcon E1 = new ImageIcon("src/data/MAIN/ZCBTN1.png");//��¼btn������
		    
		    C.setIcon(C1);
		    E.setIcon(E1);
		    duandinglan.setIcon(B1);
		    
		    duandinglan.setBounds(0,0,1366,60);//�̶���
		    
		    C.setBounds(480,150,400,456);//��¼��
		    
		    E.setBounds(550,480,270,40);//��¼btn
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
	            	JOptionPane.showMessageDialog(null, "�����������벻һ��");
	            	    }

					try {
						Class.forName("com.mysql.jdbc.Driver");//������������
						String url = "jdbc:mysql://8.129.174.219:3306/bookstore";//���������ַ���url test�����ݿ�����
						Connection conn =DriverManager.getConnection(url,"root","root");//�����ݿ�����
						
						 String banji = banji1.getText();
						 String mingzi = name1.getText();					           
				         String mima = password1.getText();
						
				         
						
						String sql="insert into user1 (mingzi,mima,banji) values ('"+mingzi+"', '"+mima+"', '"+banji+"')";//sql���
						PreparedStatement pstmt=conn.prepareStatement(sql);//���Ԥ�ö���
						
						
						
					
						
						int res=pstmt.executeUpdate();//ִ��sql���
						if(res>0){
							JOptionPane.showMessageDialog(null, "���û����ʾ����������ע��ɹ���������һ�����ڵ�¼");
							Login.main(null);
						}
						pstmt.close();//�ر���Դ
						conn.close();//�ر���Դ
						
						
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
