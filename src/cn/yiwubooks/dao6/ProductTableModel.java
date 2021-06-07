package cn.yiwubooks.dao6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ProductTableModel extends AbstractTableModel {


/**changeList用来存放被修改过的数据值,这样做是为了一次修改多行多值,
* 保存的对象是ChangedProduct,只记录被修改过的值.
*/
private static List changeList = new ArrayList();
private List list = new ArrayList();
private String[] column = { "id", "读者姓名","借阅书籍", "数量" };

public ProductTableModel() {
}

public ProductTableModel(List list) {
   this();
   setList(list);
}

public int getColumnCount() {
   return column.length;
}

public int getRowCount() {
   return list.size();
}
/**
* getValueAt方法就是使得数据在Table显示出来,给每个单元格设值
*/
public Object getValueAt(int arg0, int arg1) {
   ProductBean p = (ProductBean) list.get(arg0);
   return getPropertyValueByCol(p, arg1);
}

public void addRow(int index, ProductBean p) {
   if (index < 0 || index > list.size() - 1) {
    list.add(p);
    fireTableRowsInserted(list.size(), list.size());
   } else {
    list.add(index + 1, p);
    fireTableRowsInserted(index, index);
   }
}

public boolean deleteRow(int index) {
   if (index >= 0 && index < list.size()) {
    list.remove(index);
    fireTableRowsDeleted(index, index);
    return true;
   } else
    return false;
}

public boolean saveRow(int index, ProductBean p) {
   if (index >= 0 && index < list.size()) {
    list.set(index, p);
    fireTableRowsUpdated(index, index);
    return true;
   } else
    return false;
}

public ProductBean getRow(int index) {
   if (index >= 0 && index < list.size()) {
    return (ProductBean) list.get(index);

   } else
    return null;
}
public List getNewRow(){
   List list=new ArrayList();
   List listProduct=getList();
   Iterator it=listProduct.iterator();
   while(it.hasNext()){
    ProductBean p=new ProductBean();
    p=(ProductBean)it.next();
    if(p.getProduct_id()==0){
     list.add(p);
    }
   }
   return list;
}

public List getList() {
   return list;
}

public void setList(List list) {
   this.list = list;
   fireTableDataChanged();
}

public String getColumnName(int i) {
   return column[i];
}

public void setColumn(String[] column) {
   this.column = column;
}

public Object getPropertyValueByCol(ProductBean p, int col) {
   switch (col) {
   case 0:
    return p.getProduct_id();
   case 1:
    return p.getProduct_name();
   case 2:
    return p.getProduct_desc();
   case 3:
    return p.getProduct_status();
   }
   return null;
}

public void setPropertyValueByCol(ProductBean p, String value, int col) {
   switch (col) {
   case 1:
    p.setProduct_name(value);
    break;
   case 2:
    p.setProduct_desc(value);
    break;
   case 3:
    p.setProduct_status(value);
    break;
   }
   fireTableDataChanged();
}

public boolean isCellEditable(int row, int column) {
   return true;
}

/**
* setValueAt方法是使增加或修改值的时候生效,aValue就是你在单元格填的值,
* 要把这些值保存到数据源中
*/
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
   ProductBean p = (ProductBean) list.get(rowIndex);
   setPropertyValueByCol(p, aValue.toString(), columnIndex);
   this.fireTableCellUpdated(rowIndex, columnIndex);
}

public static List getChangeList() {
   return changeList;
}

public static void setChangeList(List changeList) {
   ProductTableModel.changeList = changeList;
}

}

