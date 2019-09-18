package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import entity.Table;
import dao.Dao;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deng")
public class Deng extends HttpServlet {
    private static final long serialVersionUID = 1L;

    Dao daa=new Dao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        int score =Integer.valueOf(req.getParameter("score"));
        boolean cb =daa.jiansuo(name,score);
        if(cb) {
            req.setAttribute("message", "登陆成功！");
//            req.getRequestDispatcher("suc.jsp").forward(req,resp);
            resp.sendRedirect("suc.jsp");

        } else {
            req.setAttribute("message", "登陆失败！");
//            req.getRequestDispatcher("bad.jsp").forward(req,resp);
            resp.sendRedirect("bad.jsp");

        }

        //String role = request.getParameter("role");
        /*Date curTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String regtime = sdf.format(curTime);
        PrintWriter out = response.getWriter();
        ServletContext ctx = this.getServletContext();
        String server = ctx.getInitParameter("name");
        String dbname = ctx.getInitParameter("score");
        User user = new User();
        user.setUsername(username);
        user.setUserpass(userpass);
        user.setRegtime(regtime);
        //user.setRole(Integer.parseInt(role));
        UserDao dao = new UserDao();
        dao.getConn(server, dbname, dbuser, dbpwd);*/


    }

}

