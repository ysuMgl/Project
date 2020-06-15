package com.project.service;

import com.project.bean.User;

import java.util.List;

public interface UserService {

    User getById(Integer id);

    List<User> getAll();
}
