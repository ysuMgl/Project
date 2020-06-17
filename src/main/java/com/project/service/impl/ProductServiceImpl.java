package com.project.service.impl;

import com.project.bean.Product;
import com.project.dao.ProductDao;
import com.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
