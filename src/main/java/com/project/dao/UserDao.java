package com.project.dao;

import com.project.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    User getById(Integer id);

    List<User> getAll();
}
