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
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login {

	public static  void main(String[] args) {
		   JDialog f = new  JDialog();
		   f.setResizable(false);
	        f.setSize(1340,770);
	       f.setLocation(250,172);
	        f.setLayout(null);
	        f.setLocationRelativeTo(null);//����
	        
	        JLabel bg = new JLabel(); //�����ؼ�
	        ImageIcon bg1 = new ImageIcon("src/data/LOGIN/zbg.png");
	        bg.setIcon(bg1);
	        bg.setBounds(0, 0,1340, 770);
	        bg.setLayout(new GridLayout(6, 1)); 
	        //1���������  2�����붥��  3������ 4.�߶�
	        
	        final JLabel toast = new JLabel(); //toast
	        ImageIcon toast1 = new ImageIcon("src/data/LOGIN/ztoast.png");
	        toast.setIcon(toast1);
	        
	        final JLabel biaoti = new JLabel("��ӭʹ��һ���������ƽ̨");
	        biaoti.setForeground(Color.white);
	        biaoti.setFont(new Font("����", Font.PLAIN, 38));
	        biaoti.setBounds(420, 00, 600, 150);
	        
	        final JLabel biaoti2 = new JLabel("�������ƽ̨ V1.98t ");
	        biaoti2.setForeground(Color.white);
	        biaoti2.setFont(new Font("����", Font.PLAIN, 18));
	        biaoti2.setBounds(575,670, 400, 30);
	        
	        final JLabel biaoti3 = new JLabel("��Ȩ����@��������ѧԺ���1902�� ����С��");
	        biaoti3.setForeground(Color.white);
	        biaoti3.setFont(new Font("����", Font.PLAIN, 18));
	        biaoti3.setBounds(480,700, 400, 30);
	        
	        // �����
	        final JTextField name1 = new JTextField("");
	        name1.setText("���������˺�");
	        name1.setBounds(520,360,270,40);
	        name1.setFont(new Font("����", Font.PLAIN, 12));
	        name1.setForeground(Color.gray);
	        name1.setOpaque(false);
	        // �����
	        //final JPasswordField password1 = new JPasswordField("");
	        final JTextField password1 = new JTextField("");
	        password1.setText("������������");
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
		    ImageIcon C1 = new ImageIcon("src/data/LOGIN/zloginblock0.png");//��¼�򲻷���
		    ImageIcon D1 = new ImageIcon("src/data/LOGIN/zloginblock1.png");//��¼�򷢹�
		    ImageIcon E1 = new ImageIcon("src/data/LOGIN/zlbtn0.png");//��¼btn������
		    ImageIcon F1 = new ImageIcon("src/data/LOGIN/zadl0.png");//��¼btn����
		    ImageIcon G1 = new ImageIcon("src/data/LOGIN/zempl0.png");//��Աδ����
		    ImageIcon H1 = new ImageIcon("src/data/LOGIN/zlogintext0.png");
		    ImageIcon I1 = new ImageIcon("src/data//LOGIN/zjiaru0.png");
		    ImageIcon J1 = new ImageIcon("src/data/LOGIN/zdianyuan0.png");
		    ImageIcon K1 = new ImageIcon("src/data/LOGIN/zdianyuan0.png");
		    ImageIcon L1 = new ImageIcon("src/data/LOGIN/zdianyuan0.png");
		    C.setIcon(C1);
		    D.setIcon(D1);
		    F.setIcon(F1);
		    E.setIcon(E1);
		    G.setIcon(G1);
		    H.setIcon(H1);
		    I.setIcon(I1);
		    J.setIcon(J1);
		    K.setIcon(K1);
		    L.setIcon(L1);
		    C.setBounds(450,150,400,456);//��¼��
		    C.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock0.png");
				C.setIcon(C2);
			    }
				}
		    );

	       
		    E.setBounds(520,470,270,40);//��¼btn
		    E.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    E.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon E2 = new ImageIcon("src/data/LOGIN/zlbtn1.png");
				E.setIcon(E2);
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
				ImageIcon E2 = new ImageIcon("src/data/LOGIN/zlbtn0.png");
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
					            System.out.println("��½�������С��� ��������Ӧ�����������ĵȴ��� ");
					            
					            String sql = "select * from user1  where mingzi = '" + mingzi +"' and mima = '" + mima+"'";
					              
					            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
					            ResultSet rs = s.executeQuery(sql);
					              
					            if(rs.next())
					            	
					           MainREAD.main(null);
					          
					            else
					            //Login.time3();
						        toast.setBounds(475, 640,350, 72);
					             
					        }}catch (SQLException e1) {
					            // TODO Auto-generated catch block
					            e1.printStackTrace();
					        }
					       
				}
				}
		    );
		     
		    
		    F.setBounds(520,280,270,40);//����
		    F.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    F.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon F2 = new ImageIcon("src/data/LOGIN/zadl1.png");
				F.setIcon(F2);
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock1.png");
				C.setIcon(C2);
				}
				@Override 
			    public void mouseExited(MouseEvent e) {
				ImageIcon F2 = new ImageIcon("src/data/LOGIN/zadl0.png");
				F.setIcon(F2);
			    }
				@Override 
			    public void mousePressed(MouseEvent e) {
					link2();
					LoginAdmin.main(null);
			    }
				private void link2() {	
				}
				}
		    );
		    
		    
		    
		    G.setBounds(660,280,270,40);//��Ա
		    G.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    G.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon G2 = new ImageIcon("src/data/LOGIN/zempl1.png");
				G.setIcon(G2);
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
				ImageIcon G2 = new ImageIcon("src/data/LOGIN/zempl0.png");
				G.setIcon(G2);
			    }
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					 @SuppressWarnings("unused")
					ImageIcon H3 = new ImageIcon("src/data/LOGIN/zjiaru0.png");
				LoginEMP.main(null);
			    }
				}
		    );
		    

		    H.setBounds(590,200,50,40);//banner��¼
		    H.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    H.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon H2 = new ImageIcon("src/data/LOGIN/zlogintext1.png");
				H.setIcon(H2);
				ImageIcon H3 = new ImageIcon("src/data/LOGIN/zjiaru0.png");
			    I.setIcon(H3);
			    ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					 ImageIcon H3 = new ImageIcon("src/data/LOGIN/zjiaru0.png");
					 I.setIcon(H3);  
					 biaoti.setText("��ӭʹ��һ���������ƽ̨");
					
			    }
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
				ImageIcon H2 = new ImageIcon("src/data/LOGIN/zlogintext1.png");
				H.setIcon(H2);
			    }
				}
		    );
		    
		    
		    I.setBounds(661,200,50,40);//banner����
		    I.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    I.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon I2 = new ImageIcon("src/data/LOGIN/zjiaru1.png");
				I.setIcon(I2);
				ImageIcon H3 = new ImageIcon("src/data/LOGIN/zlogintext0.png");
				H.setIcon(H3);
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					 ImageIcon H3 = new ImageIcon("src/data/LOGIN/zlogintext0.png");
					 H.setIcon(H3);  
					 biaoti.setText("��ӭע��һ���������ƽ̨");
					 REG.main(null);
			    }
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
				ImageIcon I2 = new ImageIcon("src/data/LOGIN/zjiaru1.png");
				I.setIcon(I2);
			    }
			
				});
	        //1���������  2�����붥��  3������ 4.�߶�
		    
		   name1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
			    }
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
				
			    }
				});
		   
		   password1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
				ImageIcon C2 = new ImageIcon("src/data/LOGIN/zloginblock1.png");
				C.setIcon(C2);
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {
			    }
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
				
			    }
				});
		  
		    f.add(toast);
		    f.add(biaoti2);
		    f.add(biaoti3);
		    f.add(G);

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


