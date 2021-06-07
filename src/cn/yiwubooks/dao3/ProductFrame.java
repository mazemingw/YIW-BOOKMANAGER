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
    //给model添加一个监听,当修改的时候将触发该事件,代表事件的类是ChangeEvent
    model.addTableModelListener(new ChangeEvent(model));
    return model;
   }
   return model;
}

public JLabel getLabHeader() {
   if (null == labHeader) {
    labHeader = new JLabel("管理员信息表[谨慎修改！！]");
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
    * 隐藏第一列ID,不显示出来
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
   * 点该按钮的时候调用addProduct()方法,在数据源(listProduct)将
   * 增加一个元素,没设值前都是null.
   */
   if (null == add) {
    add = new JButton("添加");
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
    delete = new JButton("删除");
    delete.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      /**
      * 支持一次选中多行后删除
      */
      int[] rows=getTable().getSelectedRows();
      if(rows.length>0){
      int flag=JOptionPane.showConfirmDialog(null, "确定删除?");
      if(flag==JOptionPane.YES_OPTION)
      deleteProduct();
      }
      else
       JOptionPane.showMessageDialog(null,"请选择要删除的行！");
     }

    });
    return delete;
   }
   return delete;
}

public JButton getSave() {
   if (null == save) {
    save = new JButton("执行/保存");
    save.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      saveProduct();
      JOptionPane.showMessageDialog(null,"更新成功！");
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
   //如果有修改过就调用update方法
   if(changeList.size()>0){
    dao.update(changeList);
    changeList.clear();
   }
   List newRow=getModel().getNewRow();
   //如果是新增就调用saveList,支持一次增加多行
        if(newRow.size()>0){
    dao.saveList(newRow);
    getModel().setList(dao.getList());
    getTable().updateUI();
    newRow.clear();
        }
  
}
public void deleteProduct() {
   /**支持一次删除多行,先获得所有选中的行,然后按照行数取得Product实例,
   * 放进一个list,然后传给操作数据库的deleteList方法.
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
   * 初始化数据源,从数据库里把数据拿出来,然后它会调用
   * getValueAt方法来一个单元格一个单元格来设值,让它显示出来.
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
   this.setLocationRelativeTo(null);//居中
}
public static void main(String[] args) {
   ProductFrame frame = new ProductFrame();
   frame.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     //System.exit(0);
    }

	private void setDefaultCloseOperation(int disposeOnClose) {
		// TODO 自动生成的方法存根
		
	}
   });
}
    
}