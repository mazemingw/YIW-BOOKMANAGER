package cn.yiwubooks.view;


import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class CONTEMP {

	
    public static  void  main1(String[] args) {
    	
    	//加载驱动
		//  Class.forName("com.mysql.jdbc.Driver");
		//得到连接
		//ct=DriverManager.getConnection("jdbc:mysql://8.129.174.219:3306/bookstore","root", "root");
		
		//ps=ct.prepareStatement("select * from reader");
		
    	
        // 主窗体
    	  JDialog f = new  JDialog();
	        f.setResizable(false); 
	        f.setSize(1340,770); 
	        f.setLocation(250,172);
	        f.setLayout(null); 
	        f.setLocationRelativeTo(null);//居中
	        
	        JLabel bg = new JLabel(); 
	        ImageIcon bg1 = new ImageIcon("src/data/bg1.png");
	        bg.setIcon(bg1);
	        bg.setBounds(0, 0,1340, 770);
	        bg.setLayout(new GridLayout(6, 1));
	        
	        final JLabel BARB = new JLabel();	
	        final JLabel BARM = new JLabel();
	        
	        ImageIcon C1 = new ImageIcon("src/data/MAIN/ETOPBAR.png");//长顶栏
		    ImageIcon D1 = new ImageIcon("src/data/MAIN/ETOPBARM.png");//短顶栏
		    
		    BARB.setIcon(C1);
		    BARM.setIcon(D1);
		    
		    BARB.setBounds(201,0,1165,60);//顶栏
		    BARM.setBounds(0,0,200,60);//顶栏M


		f.add(BARM);
		f.add(BARB);
        f.add(bg);
        
 
        // 关闭窗体的时候，退出程序
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // 让窗体变得可见
        f.setVisible(true);
 
    }
}