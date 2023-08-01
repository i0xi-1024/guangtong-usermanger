package cn.i0xi.guangtong.controller;

import cn.i0xi.guangtong.domain.Order;
import cn.i0xi.guangtong.service.OrderService;
import cn.i0xi.guangtong.utils.Result;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @Resource
    OrderService orderService;

    @GetMapping("/list")
    public Result<?> getOrderList(){
        return Result.success(orderService.page(new Page<>(1, 10)));
    }

    @GetMapping("/order")
    public Result<?> getOrder(@RequestParam int id){
        try{
            return Result.success(orderService.getById(id));
        }catch (Exception e){
            return Result.error(e);
        }
    }

    @PutMapping("/order")
    public Result<?> addOrder(Order order){
        try{
            return Result.success(orderService.save(order));
        }catch (Exception e){
            return Result.error(e);
        }
    }

    @PostMapping("/order")
    public Result<?> editOrder(Order order){
        try{
            return Result.success(orderService.updateById(order));
        }catch (Exception e){
            return Result.error(e);
        }
    }

    @DeleteMapping("/order")
    public Result<?> delOrder(List<Integer> id){
        try{
            return Result.success(orderService.removeByIds(id));
        }catch (Exception e){
            return Result.error(e);
        }
    }

}
