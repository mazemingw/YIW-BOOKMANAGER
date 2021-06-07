package cn.yiwubooks.dao3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableColumnModel;

public class ProductFrame extends JFrame {


private JPanel panelTop = null;
private JLabel labHeader = null;
private JPanel panelBottom = null;
private JButton add = null;
private JButton delete = null;
private JButton save = null;
private JScrollPane scroll = null;
private JTable table = null;
private ProductTableModel model = null;
private List listProduct = null;

public ProductTableModel getModel() {
   if (null == model) {
    model = new ProductTableModel(listProduct);
    //��model���һ������,���޸ĵ�ʱ�򽫴������¼�,�����¼�������ChangeEvent
    model.addTableModelListener(new ChangeEvent(model));
    return model;
   }
   return model;
}

public JLabel getLabHeader() {
   if (null == labHeader) {
    labHeader = new JLabel("����Ա��Ϣ��[�����޸ģ���]");
    return labHeader;
   }
   return labHeader;
}

public JTable getTable() {
   if (null == table) {
    table = new JTable(getModel());
    table.setEnabled(true);
    table.setRowSelectionAllowed(true);
    table.setBackground(Color.YELLOW);
    table.setRowHeight(30);
    /**
    * ���ص�һ��ID,����ʾ����
    */
    DefaultTableColumnModel dcm = (DefaultTableColumnModel)table.getColumnModel(); 
      dcm.getColumn(0).setMinWidth(0); 
      dcm.getColumn(0).setMaxWidth(0);      
    return table;
   }
   return table;
}

public JScrollPane getPanTable() {
   if (null == scroll) {
    scroll = new JScrollPane();
    scroll.setViewportView(getTable());
    return scroll;
   }
   return scroll;
}

public JPanel getPanelTop() {
   if (null == panelTop) {
    panelTop = new JPanel();
    panelTop.setLayout(new FlowLayout(FlowLayout.CENTER));
    panelTop.add(getLabHeader());
    return panelTop;
   }
   return panelTop;
}

public JPanel getPanelBottom() {
   if (null == panelBottom) {
    panelBottom = new JPanel();
    panelBottom.setLayout(new FlowLayout(FlowLayout.CENTER));
    panelBottom.add(getAdd());
    panelBottom.add(getDelete());
    panelBottom.add(getSave());
    return panelBottom;
   }
   return panelBottom;
}

public JButton getAdd() {
   /**
   * ��ð�ť��ʱ�����addProduct()����,������Դ(listProduct)��
   * ����һ��Ԫ��,û��ֵǰ����null.
   */
   if (null == add) {
    add = new JButton("���");
    add.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      addProduct();  
     }

    });
    return add;
   }
   return add;
}

public JButton getDelete() {
   if (null == delete) {
    delete = new JButton("ɾ��");
    delete.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      /**
      * ֧��һ��ѡ�ж��к�ɾ��
      */
      int[] rows=getTable().getSelectedRows();
      if(rows.length>0){
      int flag=JOptionPane.showConfirmDialog(null, "ȷ��ɾ��?");
      if(flag==JOptionPane.YES_OPTION)
      deleteProduct();
      }
      else
       JOptionPane.showMessageDialog(null,"��ѡ��Ҫɾ�����У�");
     }

    });
    return delete;
   }
   return delete;
}

public JButton getSave() {
   if (null == save) {
    save = new JButton("ִ��/����");
    save.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      saveProduct();
      JOptionPane.showMessageDialog(null,"���³ɹ���");
     }

    });
    return save;
   }
   return save;
}
public void addProduct() {
   ProductBean p = new ProductBean();
   getModel().addRow(getTable().getSelectedRow(), p);
}
public void saveProduct() {
   DaoInterface dao=DaoFactory.getDao();
   List changeList=getModel().getChangeList();
   //������޸Ĺ��͵���update����
   if(changeList.size()>0){
    dao.update(changeList);
    changeList.clear();
   }
   List newRow=getModel().getNewRow();
   //����������͵���saveList,֧��һ�����Ӷ���
        if(newRow.size()>0){
    dao.saveList(newRow);
    getModel().setList(dao.getList());
    getTable().updateUI();
    newRow.clear();
        }
  
}
public void deleteProduct() {
   /**֧��һ��ɾ������,�Ȼ������ѡ�е���,Ȼ��������ȡ��Productʵ��,
   * �Ž�һ��list,Ȼ�󴫸��������ݿ��deleteList����.
   */
   int[] rows=getTable().getSelectedRows();
   ArrayList list=new ArrayList();
   DaoInterface dao=DaoFactory.getDao();
   for(int i=rows.length-1;i>=0;i--){
   list.add(getModel().getRow(rows[i]));
   getModel().deleteRow(rows[i]);
   }
   dao.deleteList(list);
   getTable().updateUI();
   list.clear();
}
public void initData() {
   /**
   * ��ʼ������Դ,�����ݿ���������ó���,Ȼ���������
   * getValueAt������һ����Ԫ��һ����Ԫ������ֵ,������ʾ����.
   */
   listProduct = new ArrayList();
     DaoInterface dao=DaoFactory.getDao();
     listProduct=dao.getList();
   //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
}
public ProductFrame() {
   initData();
   Container c = this.getContentPane();
   c.setLayout(new BorderLayout());
   c.add(getPanelTop(), BorderLayout.NORTH);
   c.add(getPanelBottom(), BorderLayout.SOUTH);
   c.add(getPanTable(), BorderLayout.CENTER);
   this.setSize(new Dimension(600, 400));
   this.setVisible(true);
   this.setLocationRelativeTo(null);//����
}
public static void main(String[] args) {
   ProductFrame frame = new ProductFrame();
   frame.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     //System.exit(0);
    }

	private void setDefaultCloseOperation(int disposeOnClose) {
		// TODO �Զ����ɵķ������
		
	}
   });
}
    
}