package cn.i0xi.guangtong.controller;

import cn.i0xi.guangtong.domain.Order;
import cn.i0xi.guangtong.service.OrderService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @Resource
    OrderService orderService;

    @RequestMapping("/list")
    public IPage<Order> list(){
        return orderService.page(new Page<Order>(1,10));
    }

}
