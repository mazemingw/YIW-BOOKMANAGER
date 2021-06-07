package cn.yiwubooks.dao6;

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

