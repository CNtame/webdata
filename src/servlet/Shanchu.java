package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entity.Table;
import dao.Dao;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Shanchu")
public class Shanchu extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    Dao daa = new Dao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        List<Table> lis = new ArrayList<>();

        String name = req.getParameter("name");
        boolean a=daa.Shanchu(name);

        req.setAttribute("shan", a);

        if(a)
        {
            req.getRequestDispatcher("shanend.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("main.jsp").forward(req,resp);
        }


    }



}
