package cn.yiwubooks.view;
 
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
 
public class BASE { //图片展示用
    public static void main(String[] args) {
        
        JFrame f = new JFrame("SHOW");
        f.setResizable(false);
        f.setLayout(new FlowLayout());
        f.setLocationRelativeTo(null);//居中

        f.setSize(1155, 768);
        f.setLocation(250,172);
 

        final JLabel C = new JLabel(); 
        final JLabel D = new JLabel(); 
    
        
        ImageIcon C1 = new ImageIcon("src/data/LOGIN/ajieshao.png");
        ImageIcon D1 = new ImageIcon("src/data/LOGIN/aserverinfo.png");
       
        
        C.setIcon(C1);
        D.setIcon(D1);

       
        f.add(C);
        f.add(D);
 
        
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setVisible(true);
 
    }
}