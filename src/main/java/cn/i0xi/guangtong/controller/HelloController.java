package cn.i0xi.guangtong.controller;

import cn.i0xi.guangtong.service.UsersService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@ResponseBody
public class HelloController {


    @Resource
    UsersService usersService;
    @RequestMapping("/hello")
    public String hello() {
        return new Gson().toJson(usersService.list());
    }
}
