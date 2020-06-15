package com.project.controller;

import com.project.bean.User;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private UserService userService;

    @GetMapping("/getInfo")
    public Map<String,Object> test(){
        Map<String,Object> map = new HashMap<>();
        map.put("msg","你好");

        return map;
    }

    @PostMapping("/getInfo2")
    public Map<String,Object> test02(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        System.out.println("用户id： " + user.getId());
        System.out.println("用户名： " + user.getUsername());
        System.out.println("用户密码： " + user.getPassword());

        map.put("msg","以获取到信息");

        return map;
    }

    @GetMapping("/getInfo3")
    public Map<String,Object> test03(@RequestParam("id") Integer id){
        Map<String,Object> map = new HashMap<>();

        map.put("msg","success");
        map.put("data",userService.getById(id));

        return map;
    }

    @GetMapping("/getInfo4")
    public Map<String,Object> test04(){
        Map<String,Object> map = new HashMap<>();

        map.put("msg","success");
        map.put("data",userService.getAll());

        return map;
    }
}
