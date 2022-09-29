package com.Text.selvlet;

import com.Text.bean.User;
import com.Text.service.loginService;
import com.Text.service.loginServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        User u = new User();
        u.setUser(Integer.valueOf(user));
        u.setPassword(password);
        loginService l = new loginServicelmpl();
        try {
            User userone = l.loginService(u);
            if (userone != null){
                req.setAttribute("user",userone);
                req.getRequestDispatcher("userinterface.jsp").forward(req,resp);
                System.out.println("用户"+userone+"登入成功");
            }else {
                req.setAttribute("error","账户密码错误");
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
