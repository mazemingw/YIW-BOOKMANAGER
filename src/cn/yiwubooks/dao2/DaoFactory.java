package cn.yiwubooks.dao2;

public class DaoFactory {


synchronized public static DaoInterface getDao(){
DaoInterface dao=null;
if(dao==null){
dao=new DaoImpl();
return dao;
}
return dao;
}
}

