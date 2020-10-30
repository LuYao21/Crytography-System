package com.javaweb.javaWeb.servlet;

import com.javaweb.javaWeb.dao.UserDao;
import com.javaweb.javaWeb.dao.impl.UserDaoImpl;
import com.javaweb.javaWeb.util.SHA;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UpdateUserServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        int userId = Integer.parseInt(id);

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");

        System.out.println("------------------------------------"+userId);

        UserDao ud = new UserDaoImpl();
        SHA sha=new SHA();
        String pwd = sha.getSHA256(password);
        if(ud.update(userId, username, pwd, sex, email)){
            request.setAttribute("xiaoxi", "更新成功");
            request.getRequestDispatcher("/FindUserList").forward(request, response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }

}