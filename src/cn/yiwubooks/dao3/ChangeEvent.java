package cn.yiwubooks.dao3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;



public class ChangeEvent implements TableModelListener {


/**
 
*/
/**
* ����table���Ķ����¼�,ֻҪĿ����������¼���޸Ĺ���ֵ,
* ����������һ�������е��޸�ֵ,�޸�һ����Ԫ���ֵ�ͼ�¼һ��,
* ��Ҫ��¼id,��ֵ,����.
*/
ProductTableModel model = null;
public ChangeEvent(ProductTableModel model2) {
   this.model = model2;
}
List list = model.getChangeList();
int id = 0;
String value = "";

public void tableChanged(TableModelEvent arg0) {
   int row = arg0.getFirstRow();
   int col = arg0.getColumn();
   if (col != -1) {
    ChangedProduct cp = new ChangedProduct();
    id = ((Integer) model.getValueAt(row, 0)).intValue();
    if (id != 0) {
     value = model.getValueAt(row, col).toString();
     cp.setId(id);
     cp.setCol(col);
     cp.setValue(value);
     list.add(cp);
    }
   }
}

}