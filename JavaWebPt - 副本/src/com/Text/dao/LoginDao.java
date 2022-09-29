package com.Text.dao;

import com.Text.bean.User;

import java.sql.SQLException;

public interface LoginDao {
    User logindao(User u) throws ClassNotFoundException, SQLException;
}
