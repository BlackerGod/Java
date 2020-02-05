import java.math.BigDecimal;
import java.sql.*;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

    public class Test2 {
        public static void main(String[] args) {
            Connection connection=null;
            PreparedStatement statement=null;
            ResultSet resultSet=null;
            try{

                try {
                    connection= DBUTER.getConnection2();
                    System.out.println("连接成功");
                    String sql="select* from exam_result where name='唐三藏';";
                    statement=connection.prepareStatement(sql);
                    System.out.println("执行成功");
                    resultSet=statement.executeQuery();
                    System.out.println("获取结果成功");
                    //收到的结构为List<Map<String,Object>>

                    while (resultSet.next()){
                        int id=resultSet.getInt("id");
                        String name=resultSet.getString("name");
                        BigDecimal chinese=resultSet.getBigDecimal("chinese");
                        BigDecimal english=resultSet.getBigDecimal("english");
                        BigDecimal math=resultSet.getBigDecimal("math");
                        System.out.printf("ID=%s, name=%s, chinese=%s, english=%s math=%s",
                                id,name,chinese,english,math);
                        System.out.println();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    throw new RuntimeException("连接失败");
                }finally {
                    DBUTER.Connectclose(resultSet,statement,connection);
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

