package cn.yiwubooks.dao3;


import java.util.ArrayList;
import java.util.List;

public interface DaoInterface {



public List getList();
public void saveList(List list);
public void deleteList(List list);
public void update(List list);
}