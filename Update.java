import sun.security.pkcs11.Secmod;

import java.math.BigDecimal;
import java.sql.*;



import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Collections;

public class Update {
    public static void main(String[] args) {
        //Del(1);
        //Insert();
    }
    public  static  void  Update(){
        //未完，待续
    }
    public static void Insert(int ID,String NAME,double CHINESE,Double MATH,double ENGLISH){
        try {
            Connection cn=DBUTER.getConnection2();
            String sql="insert into exam_result values(?,?,?,?,?)";
            PreparedStatement statement=cn.prepareStatement(sql);
            statement.setInt(1,ID);
            statement.setString(2,NAME);
            statement.setDouble(3,CHINESE);
            statement.setDouble(4,MATH);
            statement.setDouble(5,ENGLISH);
            int c=statement.executeUpdate();
            if(c>0){
                System.out.println("插入成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void Del(int Id) {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try{

            try {
                connection= DBUTER.getConnection2();
                System.out.println("连接成功");
                String sql="delete from exam_result where id=?;";
                statement=connection.prepareStatement(sql);
                statement.setInt(1,1);
                System.out.println("执行成功");
                int c=statement.executeUpdate();//新增 删除 修改都用这个
                //返回值为int，表示修改了几行
                if(c>0) {
                    System.out.println("修改成功");
                    //收到的结构为List<Map<String,Object>>s
                }
            }catch (Exception e){
                e.printStackTrace();
                throw new RuntimeException("连接失败");
            }finally {
                DBUTER.Connectclose(null,statement,connection);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

