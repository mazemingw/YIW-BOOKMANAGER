package cn.yiwubooks.view;


import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

class MainREAD {
	
	public static  void main(String[] args) {
		JFrame f = new  JFrame("reader");
		    f.setResizable(true);
	        f.setSize(1366,768);
	        f.setLocation(250,172);
	        f.setLayout(null);
	        f.setLocationRelativeTo(null);//居中

	        final JLabel changdinglan = new JLabel();	
	        final JLabel duandinglan = new JLabel();
	        final JLabel cebianlan = new JLabel();
	        final JLabel beijing = new JLabel();
	        final JLabel touxiang = new JLabel();
	        final JLabel mingzi = new JLabel();        
		    ImageIcon A1 = new ImageIcon("src/data/MAIN/rtopbar.png");//长顶栏
		    ImageIcon B1 = new ImageIcon("src/data/MAIN/rtopbarM.png");//短顶栏
		    ImageIcon C1 = new ImageIcon("src/data/MAIN/rbroadside.png");//左栏
		    ImageIcon D1 = new ImageIcon("src/data/MAIN/rtouxiang.png");//右上角头像
		    ImageIcon E1 = new ImageIcon("src/data/MAIN/rtopbarM2.png");//左上角名字
	
		    changdinglan.setIcon(A1);
		    duandinglan.setIcon(B1);
		    cebianlan.setIcon(C1);
		    touxiang.setIcon(D1);
		    mingzi.setIcon(E1);
		    
		    changdinglan.setBounds(201,0,1165,60);//长顶栏
		    duandinglan.setBounds(0,0,200,60);//短顶栏
		    cebianlan.setBounds(0,60,200,670);//侧边栏
		    mingzi.setBounds(0,0,200,60);//左上角系统名字
		    touxiang.setBounds(1226,0,135,60);//右上角头像
	        touxiang.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon X2 = new ImageIcon("src/data/MAIN/rtouxiang1.png");
					touxiang.setIcon(X2);
				}
				@Override //当鼠标移出
			    public void mouseExited(MouseEvent e) {
					ImageIcon X2 = new ImageIcon("src/data/MAIN/rtouxiang.png");
					touxiang.setIcon(X2);
			    }
				@Override //当鼠标按下
			    public void mousePressed(MouseEvent e) {			 
					ImageIcon X2 = new ImageIcon("src/data/MAIN/rtouxiang2.png");
					touxiang.setIcon(X2);
				}
	        }
	        );
	        
	        JPanel p1 = new JPanel();
	        // 设置面板大小
	        p1.setBounds(350, 350, 825, 215);
	        // 设置面板背景颜色
	       
	 
	        // 这一句可以没有，因为JPanel默认就是采用的FlowLayout
	        p1.setLayout(new FlowLayout());
	 
	        final JLabel b1 = new  JLabel();
	        final JLabel b2 = new  JLabel();
	 
	        ImageIcon b11 = new ImageIcon("src/data/MAIN/EJYGL0.png");
		    ImageIcon b12 = new ImageIcon("src/data/MAIN/EBMFT0.png");
		    
		    b1.setIcon(b11);
		    b2.setIcon(b12);
	
	        // 把按钮加入面板
	        p1.add(b1);
	        p1.add(b2);
	    
	 
	        b1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon C2 = new ImageIcon("src/data/MAIN/EJYGL1.png");
					b1.setIcon(C2);
			
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {	
					ImageIcon C2 = new ImageIcon("src/data/MAIN/EJYGL0.png");
					b1.setIcon(C2);
			    }
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					cn.yiwubooks.dao6.ProductFrame.main(null);
			    }});
	
	        b2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					ImageIcon C2 = new ImageIcon("src/data/MAIN/EBMFT1.png");
					b2.setIcon(C2);
			
				}
				@Override //mouse move out
			    public void mouseExited(MouseEvent e) {	
					ImageIcon C2 = new ImageIcon("src/data/MAIN/EBMFT0.png");
					b2.setIcon(C2);
			    }
				@Override //mouse clicked
			    public void mousePressed(MouseEvent e) {
					JOptionPane.showMessageDialog(null, "书本阅读器：未完成");
			    }});


	        f.add(p1);
		    f.add(mingzi);
		    f.add(touxiang);
		    f.add(beijing);
		    f.add(cebianlan);
		    f.add(duandinglan);
		    f.add(changdinglan);
	        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	        f.setVisible(true);
}
	}
