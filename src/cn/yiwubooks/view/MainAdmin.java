package cn.yiwubooks.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import cn.yiwubooks.dao.ProductFrame;

public class MainAdmin {
	
	public static  void main(String[] args) {
		JFrame f = new  JFrame("Admin");
		    f.setResizable(true);
	        f.setSize(1366,768);
	        f.setLocation(250,172);
	        f.setLayout(null);
	        f.setLocationRelativeTo(null);//����

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
	        final JLabel M = new JLabel();
	        final JLabel N = new JLabel();
	        final JLabel O = new JLabel();
	        final JLabel P  = new JLabel();
	        final JLabel Q = new JLabel();
	        final JLabel R = new JLabel();
	        final JLabel S  = new JLabel();
	        final JLabel T = new JLabel();
	        final JLabel U = new JLabel();
	        final JLabel V = new JLabel();
	        final JLabel W= new JLabel();
	        final JLabel X = new JLabel();
	        final JLabel Y =  new JLabel();
	        final JLabel Z = new JLabel();
	        //ͷ���ĸ�������С��
	        final JLabel employees = new JLabel();
	        final JLabel reader = new JLabel();
	        final JLabel root = new JLabel();
	        final JLabel shuoming = new JLabel();
	        final JLabel book = new JLabel();
	        final JLabel jieyue = new JLabel();
	        final JLabel bmft = new JLabel();
	        
		    ImageIcon C1 = new ImageIcon("src/data/bar/topbar.png");//������
		    ImageIcon D1 = new ImageIcon("src/data/bar/topbarM.png");//�̶���
		    ImageIcon E1 = new ImageIcon("src/data/bar/broadside.png");//��¼btn������
		    ImageIcon F1 = new ImageIcon("src/data/bar/bg0.png");//��¼btn����
		    ImageIcon G1 = new ImageIcon("src/data/bar/bg1.png");//��Աδ����
		    final ImageIcon H1 = new ImageIcon("src/data/bar/broadsideM1.png");//���˵���ť
		    final ImageIcon I1 = new ImageIcon("src/data/bar/broadsideM2.png");
		    final ImageIcon J1 = new ImageIcon("src/data/bar/broadsideM3.png");
		    final ImageIcon K1 = new ImageIcon("src/data/bar/broadsideM4.png");
		    final ImageIcon L1 = new ImageIcon("src/data/bar/broadsideM5.png");//���˵���ť
		    ImageIcon M1 = new ImageIcon("src/data/bar/accout.png");//���
		    ImageIcon N1 = new ImageIcon("src/data/bar/system.png");
		    ImageIcon O1 = new ImageIcon("src/data/bar/books.png");
		    ImageIcon P1 = new ImageIcon("src/data/bar/reader.png");
		    ImageIcon Q1 = new ImageIcon("src/data/bar/bookmanager.png");//���
		    ImageIcon R1 = new ImageIcon("src/data/bar/search.png");//search
		    ImageIcon S1 = new ImageIcon("src/data/bar/infoblock11.png");//��Ϣ���
		    ImageIcon T1 = new ImageIcon("src/data/bar/infoblock12.png");//��Ϣ���
		    ImageIcon U1 = new ImageIcon("src/data/bar/infoblock13.png");//��Ϣ���
		    ImageIcon V1 = new ImageIcon("src/data/bar/loginlog.png");//��¼ip
		    ImageIcon W1 = new ImageIcon("src/data/bar/otherinfo.png");//������Ϣ
		    ImageIcon X1 = new ImageIcon("src/data/bar/touxiang.png");//���Ͻ�ͷ��
		    ImageIcon Y1 = new ImageIcon("src/data/bar/menu.png");//�˵�С��ť
		    ImageIcon Z1 = new ImageIcon("src/data/bar/topbarM2.png");//���Ͻ�����
	
		    final ImageIcon YGZH = new ImageIcon("src/data/bar/font/employees0.png");
		    final ImageIcon DZZH = new ImageIcon("src/data/bar/font/reader0.png");
		    final ImageIcon ZGQX = new ImageIcon("src/data/bar/font/root0.png");
		    final ImageIcon SYSM = new ImageIcon("src/data/bar/font/shuoming0.png");
		    final ImageIcon TSGL = new ImageIcon("src/data/bar/font/book0.png");
		    final ImageIcon JYGL = new ImageIcon("src/data/bar/font/jieyueguanli0.png");
		    final ImageIcon BMFT = new ImageIcon("src/data/bar/font/banmufangtang0.png");
		    
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
		    M.setIcon(M1);
		    N.setIcon(N1);
		    O.setIcon(O1);
		    P.setIcon(P1);
		    Q.setIcon(Q1);
		    R.setIcon(R1);
		    S.setIcon(S1);
		    T.setIcon(T1);
		    U.setIcon(U1);
		    V.setIcon(V1);
		    W.setIcon(W1);
		    X.setIcon(X1);
		    Y.setIcon(Y1);
		    Z.setIcon(Z1);
		    
		    employees.setIcon(YGZH);
		    reader.setIcon(DZZH);
		    root.setIcon(ZGQX);
		    shuoming.setIcon(SYSM);
		    book.setIcon(TSGL);
		    jieyue.setIcon(JYGL);
		    bmft.setIcon(BMFT);

		    C.setBounds(201,0,1165,60);//����
		    D.setBounds(0,0,200,60);//����M
		    E.setBounds(0,60,200,670);//�����
		    F.setBounds(0,0,1366,768);//�װ�
		    G.setBounds(215,70,1115,645);//����ɫ�װ�
		    
    
		    
		    M.setBounds(250,150,232,97);//�˻����� 
		    employees.setBounds(260, 215, 72, 18);
		    reader.setBounds(362, 215, 72, 18);
		    
		    employees.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    employees .addMouseListener(new MouseAdapter() {//Ա���˻�
		    	
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/employees1.png");
					 employees.setIcon(H1);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 employees.setIcon(YGZH);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/employees1.png");
					 employees.setIcon(H1);
					 ProductFrame.main(null);
				}});
		    
		    reader.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    reader .addMouseListener(new MouseAdapter() {//�����˻�����
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/reader1.png");
					 reader.setIcon(H1);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 reader.setIcon(DZZH);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/reader1.png");
					 reader.setIcon(H1);
					 cn.yiwubooks.dao2.ProductFrame.main(null);
					 
				}});
		    
		    N.setBounds(502,150,232,97);//ϵͳ����ť
		    root.setBounds(512, 215, 72, 18);
		    shuoming.setBounds(614, 215, 72, 18);
		    
		    root.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    root .addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/root1.png");
					 root.setIcon(H1);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 root.setIcon(ZGQX);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {//��������
					ImageIcon H1 = new ImageIcon("src/data/bar/font/root1.png");
					 root.setIcon(H1);
					 cn.yiwubooks.dao3.ProductFrame.main(null);
				}});
		    
		    shuoming.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    shuoming .addMouseListener(new MouseAdapter() {//ʹ��˵��
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/shuoming1.png");
				     linkshuoming();	
					 shuoming.setIcon(H1);
				}
				private void linkshuoming() {
					// TODO �Զ����ɵķ������
					
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 shuoming.setIcon(SYSM);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/shuoming1.png");
					 shuoming.setIcon(H1);
					 BASE.main(null);
				}});
		    
		    O.setBounds(754,150,232,97);//ͼ�����ť
		    book.setBounds(764, 215, 72, 18);
		    jieyue.setBounds(866, 215, 72, 18);
		    
		    book.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    book .addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/book1.png");
				    book.setIcon(H1);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					book.setIcon(TSGL);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/book1.png");
					 book.setIcon(H1);
					 cn.yiwubooks.dao4.ProductFrame.main(null);
				}});
		    
		    jieyue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    jieyue .addMouseListener(new MouseAdapter() {//���Ĺ���
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/jieyueguanli1.png");
					 jieyue.setIcon(H1);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 jieyue.setIcon(JYGL);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/jieyueguanli1.png");
					 jieyue.setIcon(H1);
					 cn.yiwubooks.dao5.ProductFrame.main(null);
				}});
		    
		    P.setBounds(1006,150,232,97);//��Ķ������ť
		    bmft.setBounds(1016, 215, 72, 18);
		    
		    bmft.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    bmft.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/banmufangtang1.png");
					 bmft.setIcon(H1);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					bmft.setIcon(BMFT);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/font/banmufangtang1.png");
					 bmft.setIcon(H1);
					 JOptionPane.showMessageDialog(null, "�鱾�Ķ�����δ���");
				}});
		    
		    
		    
		    
		    
		    H.setBounds(0,60,200,60);//���M1
		    H.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon H1 = new ImageIcon("src/data/bar/broadsideM111.png");
					 H.setIcon(H1);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 ImageIcon H12 = new ImageIcon("src/data/bar/broadsideM11.png");
					 H.setIcon(H12);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					 ImageIcon H1 = new ImageIcon("src/data/bar/broadsideM11.png");
					 H.setIcon(H1);
					 I.setBounds(0,240,200,60);//���M2
					J.setBounds(0,300,200,60);//���M3
					K.setBounds(0,360,200,60);//���M4
					L.setBounds(0,420,200,60);//���M5
					}
				}
		    );
		      
		    
		    
		    I.setBounds(0,120,200,60);//���M2
		    I.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon I1 = new ImageIcon("src/data/bar/broadsideM222.png");
					 I.setIcon(I1);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 ImageIcon I22 = new ImageIcon("src/data/bar/broadsideM22.png");
					 I.setIcon(I22);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					 ImageIcon I2 = new ImageIcon("src/data/bar/broadsideM22.png");
					 I.setIcon(I2);
					J.setBounds(0,360,200,60);//���M3
					K.setBounds(0,420,200,60);//���M4
					L.setBounds(0,480,200,60);//���M5
					
				}
			}
		 );
		    
		    
		    J.setBounds(0,180,200,60);//���M3	    
		    J.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					 ImageIcon J3 = new ImageIcon("src/data/bar/broadsideM333.png");
					 J.setIcon(J3);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 ImageIcon J32 = new ImageIcon("src/data/bar/broadsideM33.png");
					 J.setIcon(J32);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					 ImageIcon I1 = new ImageIcon("src/data/bar/broadsideM33.png");
					 J.setIcon(I1);
					K.setBounds(0,480,200,60);//���M4
					L.setBounds(0,540,200,60);//���M5
					
				}});
		    
		    
		    
		    K.setBounds(0,240,200,60);//���M4
		    K.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					 ImageIcon K4 = new ImageIcon("src/data/bar/broadsideM444.png");
					 K.setIcon(K4);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					 ImageIcon K42 = new ImageIcon("src/data/bar/broadsideM44.png");
					 K.setIcon(K42);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					 ImageIcon I1 = new ImageIcon("src/data/bar/broadsideM44.png");
					 K.setIcon(I1);
					L.setBounds(0,600,200,60);//���M5
					
				}});
		    
		    
		    
		    L.setBounds(0,300,200,60);//���M5
		    L.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					 ImageIcon L5 = new ImageIcon("src/data/bar/broadsideM555.png");
					 L.setIcon(L5);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					L.setIcon(L1);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
					  H.setBounds(0,60,200,60);//ϵͳ�˵�1
					  H.setIcon(H1);
					  I.setBounds(0,120,200,60);//ϵͳ�˵�2
					  I.setIcon(I1);
					 J.setBounds(0,180,200,60);//ϵͳ�˵�3 
					 J.setIcon(J1);
					 K.setBounds(0,240,200,60);//ϵͳ�˵�4
					 K.setIcon(K1);
					 L.setBounds(0,300,200,60);//ϵͳ�˵�5
				}});
		
		    S.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon S2 = new ImageIcon("src/data/bar/infoblock1.png");
					S.setIcon(S2);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					ImageIcon S2 = new ImageIcon("src/data/bar/infoblock11.png");
					S.setIcon(S2);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {
				 
				}} );
		    
		    
		    T.setBounds(590,300,310,128);//info block
		    T.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon T2 = new ImageIcon("src/data/bar/infoblock1.png");
					T.setIcon(T2);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					ImageIcon T2 = new ImageIcon("src/data/bar/infoblock12.png");
					T.setIcon(T2);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {			 
 }});
		    
		    
		    U.setBounds(930,300,310,128);//info block
		    U.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon U2 = new ImageIcon("src/data/bar/infoblock1.png");
					U.setIcon(U2);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					ImageIcon U2 = new ImageIcon("src/data/bar/infoblock13.png");
					U.setIcon(U2);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {			 
 }});
		    
		    final JTextField search = new JTextField("");
	        search.setText(" ���� ");
	        search.setFont(new Font("����", Font.PLAIN, 12));
	        search.setForeground(Color.gray);
	        search.setOpaque(false);
	        
	        X.setBounds(1226,0,135,60);//���Ͻ�ͷ��
	        X.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon X2 = new ImageIcon("src/data/bar/touxiang1.png");
					X.setIcon(X2);
				}
				@Override //������Ƴ�
			    public void mouseExited(MouseEvent e) {
					ImageIcon X2 = new ImageIcon("src/data/bar/touxiang.png");
					X.setIcon(X2);
			    }
				@Override //����갴��
			    public void mousePressed(MouseEvent e) {			 
					ImageIcon X2 = new ImageIcon("src/data/bar/touxiang2.png");
					X.setIcon(X2);
				}
	        }
	        );
	        
	        search.setBounds(1008,90,200,34);
	        Q.setBounds(0,300,200,60);
		    R.setBounds(1008,90,232,34);//search
		    S.setBounds(250,300,310,128);//info block
		    V.setBounds(240,470,635,245);//login log
		    W.setBounds(905,470,635,245);//other inf
		    Y.setBounds(220,17,24,24);//�˵�С��ť
		    Z.setBounds(0,0,200,60);//���Ͻ�ϵͳ����
		    
		    f.add(employees);
		    f.add(reader);
		    f.add(root);
		    f.add(shuoming);
		    f.add(book);
		    f.add(jieyue);
		    f.add(bmft);
		    
		    f.add(search);
		    f.add(W);//������Ϣ���
		    f.add(Z);//ϵͳ����
		    f.add(X);//ͷ�����
		    f.add(Y);
		    f.add(C);
		    f.add(D);
		    f.add(H);
		    f.add(I);
		    f.add(J);
		    f.add(K);
		    f.add(L);//���
		    f.add(E);
		    f.add(M);
		    f.add(N);
		    f.add(O);
		    f.add(P);
		    //f.add(Q);
		   
		    
		    f.add(R);
		    f.add(S);//��Ϣ���
		    f.add(T);//��Ϣ���
		    f.add(U);//��Ϣ���
		    f.add(V);//IP���
		   
		    
		    
		    f.add(F);
		    f.add(G);//�ײ�����
		   //�ײ㱳��
	        f.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        f.setVisible(true);
}
	}
