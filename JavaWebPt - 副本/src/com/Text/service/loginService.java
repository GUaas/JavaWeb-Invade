package com.Text.service;

import com.Text.bean.User;

import java.sql.SQLException;

public interface loginService {
    User loginService(User u) throws SQLException, ClassNotFoundException;
}
