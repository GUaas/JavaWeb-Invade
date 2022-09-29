package com.Text.dao;

import com.Text.bean.User;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class LoginDaolmpl implements LoginDao{
    @Override
    public User logindao(User u) throws ClassNotFoundException, SQLException {
        int id = u.getUser();
        String pwd = u.getPassword();
        Class.forName("com.mysql.jdbc.Driver");
        String userName = "root";
        String password = "12345";
        String url = "jdbc:mysql://localhost:3306/jdb?characterEncoding=utf8&useSSL=false";
        Connection connection = DriverManager.getConnection(url, userName, password);
        if (connection == null) {
            System.out.println("连接失败！");
        } else {
            System.out.println("连接成功！");
        }
        String sql = "SELECT * FROM userpaw WHERE user = "+id+" AND password='"+pwd+"'";
        try{
            Statement xs = connection.createStatement();
            ResultSet gk = xs.executeQuery(sql);
            while (gk.next()){
                 User user = new User();
                 user.setUser(gk.getInt("user"));
                 user.setPassword(gk.getString("password"));
                 user.setName(gk.getString("name"));
                 return user;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
