package cn.yiwubooks.view;


import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class CONTEMP {

	
    public static  void  main1(String[] args) {
    	
    	//��������
		//  Class.forName("com.mysql.jdbc.Driver");
		//�õ�����
		//ct=DriverManager.getConnection("jdbc:mysql://8.129.174.219:3306/bookstore","root", "root");
		
		//ps=ct.prepareStatement("select * from reader");
		
    	
        // ������
    	  JDialog f = new  JDialog();
	        f.setResizable(false); 
	        f.setSize(1340,770); 
	        f.setLocation(250,172);
	        f.setLayout(null); 
	        f.setLocationRelativeTo(null);//����
	        
	        JLabel bg = new JLabel(); 
	        ImageIcon bg1 = new ImageIcon("src/data/bg1.png");
	        bg.setIcon(bg1);
	        bg.setBounds(0, 0,1340, 770);
	        bg.setLayout(new GridLayout(6, 1));
	        
	        final JLabel BARB = new JLabel();	
	        final JLabel BARM = new JLabel();
	        
	        ImageIcon C1 = new ImageIcon("src/data/MAIN/ETOPBAR.png");//������
		    ImageIcon D1 = new ImageIcon("src/data/MAIN/ETOPBARM.png");//�̶���
		    
		    BARB.setIcon(C1);
		    BARM.setIcon(D1);
		    
		    BARB.setBounds(201,0,1165,60);//����
		    BARM.setBounds(0,0,200,60);//����M


		f.add(BARM);
		f.add(BARB);
        f.add(bg);
        
 
        // �رմ����ʱ���˳�����
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // �ô����ÿɼ�
        f.setVisible(true);
 
    }
}