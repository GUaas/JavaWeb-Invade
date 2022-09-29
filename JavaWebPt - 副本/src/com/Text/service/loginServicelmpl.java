package com.Text.service;

import com.Text.bean.User;
import com.Text.dao.LoginDao;
import com.Text.dao.LoginDaolmpl;

import java.sql.SQLException;

public class loginServicelmpl implements loginService{
    @Override
    public User loginService(User u) throws SQLException, ClassNotFoundException {
        LoginDao ld = new LoginDaolmpl();
        return ld.logindao(u);
    }
}
