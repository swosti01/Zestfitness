
package controller;

import UserService.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.student;

/**
 *
 * @author swost
 */
@WebServlet(name = "MyServlet", urlPatterns = {"/user"})
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        String page = request.getParameter("page");
        
        if(page.equalsIgnoreCase("newuser")){
            student st = new student();
            st.setFullname(request.getParameter("fullname"));
            st.setUsername(request.getParameter("username"));
            st.setPassword(request.getParameter("password"));
            new UserService().insertuser(st);
            out.println("data inserted");
            request.getRequestDispatcher("register.jsp").forward(request,response); 
        }
        
        if(page.equalsIgnoreCase("login")){
            student st = new student();
            st.setUsername(request.getParameter("username"));
            st.setPassword(request.getParameter("password"));
             UserService user =new UserService();
            try {
                if(user.login(st)){
                    request.getRequestDispatcher("home.jsp").forward(request,response);  
                }
                else{
                    out.print("<script>alert('Login fail.')</script>");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            new UserService().insertuser(st);
            out.println("data inserted");
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
        
    }
}
