package utia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.Exception;


public class Shujuku
{


    //数据库连接
//为啥要返回Connection对象,以及使用静态方法
    public static Connection connect()
    {
        String url="jdbc:mysql://localhost:3306/student";
        String per="root";
        String pass="123456";

        Connection conn=null;
//        Statement stmt=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("加载驱动成功；");
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("加载驱动失败；");
        }
        try
        {
            conn=DriverManager.getConnection(url,per,pass);
            System.out.println("连接数据库成功。");
        }catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("连接数据库失败。");
        }
        return conn;

    }

    public static  void close(Connection conn,Statement sta)
    {
        try
        {
            if(conn!=null)
            {
                conn.close();
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            if(sta!=null)
            {
                sta.close();
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn,Statement sta,ResultSet rs)
    {
        try
        {
            if(conn!=null)
            {
                conn.close();
            }
        }catch (SQLException e)
        {
            e.printStackTrace();

        }

        try
        {
            if(sta!=null)
            {
                sta.close();
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        try
        {
            if(rs!=null)
            {
                rs.close();
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

    }


}
