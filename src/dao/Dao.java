package dao;

import utia.Shujuku;
import entity.Table;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;

public class Dao
{

    //查询数据表中全部数据
    public static List<Table> suoyou()
    {
        Connection conn=Shujuku.connect();
        Statement st=null;
        ResultSet rs=null;
        Table ta=null;
        List<Table> list=new ArrayList<>();
        try
        {
            String sql="select * from inf";
            st=conn.createStatement();        //建立一个Connection对象
            rs=st.executeQuery(sql);              //执行sql语句

            while(rs.next())
            {
                String a=rs.getString("name");
                String b=rs.getString("sex");
                int c=rs.getInt("age");
                int d=rs.getInt("score");
                ta=new Table(a,b,c,d);
                list.add(ta);

            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return list;

    }
    //增添一行
    public static boolean  zeng(Table ta)
    {
        Connection conn=Shujuku.connect();
        Statement st=null;
//        ResultSet rs=null;
        int num=0;
        boolean d=false;
        try
        {
            String sql = "insert into inf(name,sex,age,score) values('" +ta.getName() + "','" + ta.getSex() +"','" + ta.getAge() +"','" +ta.getScore() +  "')";//添加

            st=conn.createStatement();        //建立一个Connection对象
//            rs=st.executeQuery(sql);              //执行sql语句
            num=st.executeUpdate(sql);

        }catch(SQLException e)
        {
            e.printStackTrace();
        }finally {
            Shujuku.close(conn,st);
        }
        if(num>0)
            d=true;
        return d;

    }

    //检索，查询是否注册
    public static boolean jiansuo(String name,int score)
    {
        Connection conn=Shujuku.connect();
        Statement st=null;
        ResultSet rs=null;
        boolean c=false;
        try
        {
            String sql = "select * from inf";
            st=conn.createStatement();        //建立一个Connection对象
            rs=st.executeQuery(sql);              //执行sql语句
            while(rs.next())
            {
                String a=rs.getString("name");
                String b=rs.getString("sex");
                int cc=rs.getInt("age");
                int d=rs.getInt("score");

                if(name.equals(a)&&(score==d))
                {
                    Shujuku.close(conn,st,rs);
                    return true;
                }
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally{
            Shujuku.close(conn,st,rs);
        }
        return false;

    }

































}
