package com.project.controller;


import com.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/query")
    public Map<String,Object> fun1(){
        Map<String,Object> map = new HashMap<>();

        map.put("data",productService.getAll());

        return map;
    }
}
