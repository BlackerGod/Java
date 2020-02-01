import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.*;

public class DBUTER {
    private static final String URL="jdbc:mysql://localhost:3306/test";
    private static final String USER="root";
    private static final String PASSWORD="root";

    private static DataSource DS=new MysqlDataSource();
    private  static DataSource DS2;
    static {
        ((MysqlDataSource) DS).setURL(URL);
        ((MysqlDataSource) DS).setUser(USER);
        ((MysqlDataSource) DS).setPassword(PASSWORD);
        }
    public static Connection getConnection1() {
        Connection connection=null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection=DriverManager.getConnection(URL,USER,PASSWORD);
                return connection;
            } finally {
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Connection getConnection2(){
        try {
            return DS.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("数据库连接失败");
        }

    }
    public static DataSource getConnection3(){
        if(DS2 == null){
            DS2=new MysqlDataSource();
            ((MysqlDataSource) DS2).setURL(URL);
            ((MysqlDataSource) DS2).setUser(USER);
            ((MysqlDataSource) DS2).setPassword(PASSWORD);
        }
        return DS2;
    }
    public static void Connectclose(ResultSet resultSet,Statement statement,Connection connection){
        try {
            if(resultSet != null){
                resultSet.close();
            }
            if(statement !=null){
                statement.close();
            }
            if(connection != null ){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new RuntimeException("释放资源失败");
        }
    }
}
