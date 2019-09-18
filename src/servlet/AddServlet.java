package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Table;
import dao.Dao;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    Dao service=new Dao();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request,response);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 方法选择
         */
        req.setCharacterEncoding("utf-8");
/*        String method = req.getParameter("method");
        if ("add".equals(method)) {
            add(req, resp);
        } else if ("deng".equals(method)) {
            deng(req, resp);
        }*//* else if ("update".equals(method)) {
            update(req, resp);
        } else if ("select".equals(method)) {
            select(req, resp);
        } else if ("getCoursebyName".equals(method)) {
            getCoursebyName(req, resp);
        } else if ("getCoursebyName2".equals(method)) {
            getCoursebyName2(req, resp);
        }   else if ("list".equals(method)) {
            list(req, resp);
        }*//*
    }





    private void add(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {*/
//        req.setCharacterEncoding("utf-8");
        String a = req.getParameter("name");
        String b = req.getParameter("sex");
        int c = Integer.valueOf(req.getParameter("age"));
        int d=Integer.valueOf(req.getParameter("score"));
        Table ta=new Table(a,b,c,d);
        boolean k=Dao.zeng(ta);
        if(k) {
            req.setAttribute("message", "添加成功");//setAttribute方法用于将内容保存在对象中，传到add.jsp中
//            req.getRequestDispatcher("suczhu.jsp").forward(req,resp);//getRequestDispatcher方法用于进入下一个页面
            resp.sendRedirect("suczhu.jsp");
        }else{
            req.setAttribute("message", "数据库添加失败");
//            req.getRequestDispatcher("zhubad.jsp").forward(req,resp);
            resp.sendRedirect("zhubad.jsp");
        }
    }
 /*   private void deng(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        *//*
         * 通过名字查找
         * 跳转至删除
         *//*
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        int score=Integer.valueOf(req.getParameter("score"));
        boolean course =service.jiansuo(name,score);
        if(course) {
            req.setAttribute("message", "登陆成功！");
            req.getRequestDispatcher("deletebyName.jsp").forward(req,resp);
        } else {
            req.setAttribute("course", "登陆失败！");
            req.getRequestDispatcher("delete.jsp").forward(req,resp);
        }
    }*/










}
