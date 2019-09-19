package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import entity.Table;
import dao.Dao;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






@WebServlet("/Chaxun")
public class Chaxun extends HttpServlet {
    private static final long serialVersionUID = 1L;

    Dao daa = new Dao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        List<Table> lis = new ArrayList<>();

        lis = daa.suoyou();


        req.setAttribute("list", lis);
//            req.getRequestDispatcher("bad.jsp").forward(req,resp);
//        resp.sendRedirect("list.jsp");
        req.getRequestDispatcher("list.jsp").forward(req,resp);


    }

}
