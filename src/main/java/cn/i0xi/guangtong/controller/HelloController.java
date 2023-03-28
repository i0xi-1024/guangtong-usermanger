package cn.i0xi.guangtong.controller;

import cn.i0xi.guangtong.domain.Users;
import cn.i0xi.guangtong.service.UsersService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class HelloController {

    @Resource
    UsersService usersService;
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<Users> hello() {
        List<Users> users = usersService.list();
        log.info(users.toString());
        return users;
    }

    @RequestMapping("/addUsers")
    public Users addUser(Users users){
        usersService.saveOrUpdate(users);
        return users;
    }
}
