package com.project.dao;

import com.project.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface ProductDao {

    List<Product> getAll();
}
