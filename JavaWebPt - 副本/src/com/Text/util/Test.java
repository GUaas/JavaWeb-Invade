package com.Text.util;

import com.Text.bean.User;
import com.Text.dao.LoginDaolmpl;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int id = 66;
        String pwd = "11";
        User u = new User();
        u.setUser(id);
        u.setPassword(pwd);
        LoginDaolmpl l = new LoginDaolmpl();
        User retUse = l.logindao(u);
        if(retUse != null){
            System.out.println(retUse.toString());
            System.out.println("密码正确");
        }else {
            System.out.println("密码错误");
        }
    }
}