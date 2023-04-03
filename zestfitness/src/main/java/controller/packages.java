/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import UserService.UserService;
import UserService.packageservices;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import model.student;
import model.packagemodel;

/**
 *
 * @author swost
 */
@WebServlet(name = "packages", urlPatterns = {"/packages"})
public class packages extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        String page = request.getParameter("page");
        
      
        if(page.equalsIgnoreCase("newuser")){
            packagemodel st = new packagemodel();
//            String name = request.getParameter("pakagename");
//            System.out.println(name);
            st.setPackageName(request.getParameter("name"));
            st.setTrainerName(request.getParameter("Tname"));
            st.setDuration(request.getParameter("duration"));
            st.setPrice(request.getParameter("price"));
            new packageservices().insertuser(st);
            out.println("data inserted");
            request.getRequestDispatcher(".jsp").forward(request,response); 
            System.out.println("data innnnn");
        }
    }

}
