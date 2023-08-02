package cn.i0xi.guangtong.controller;

import cn.i0xi.guangtong.domain.Order;
import cn.i0xi.guangtong.dto.OrderListDto;
import cn.i0xi.guangtong.service.OrderService;
import cn.i0xi.guangtong.utils.Result;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @Resource
    OrderService orderService;

    @GetMapping("/list")
    public Result<?> getOrderList(OrderListDto orderListDto) {
        try {
            return Result.success(orderService.getOrderList(orderListDto));
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.toString());
            return Result.error(e);
        }
    }

    @GetMapping("/order")
    public Result<?> getOrder(@RequestParam int id) {
        try {
            return Result.success(orderService.getById(id));
        } catch (Exception e) {
            return Result.error(e);
        }
    }

    @PutMapping("/order")
    public Result<?> addOrder(Order order) {
        try {
            if (orderService.save(order)) {
                return Result.success();
            } else {
                return Result.error("保存失败！");
            }
        } catch (Exception e) {
            return Result.error(e);
        }
    }

    @PostMapping("/order")
    public Result<?> editOrder(Order order) {
        try {
            if (orderService.updateById(order)) {
                return Result.success();
            } else {
                return Result.error("修改失败！");
            }
        } catch (Exception e) {
            return Result.error(e);
        }
    }

    @DeleteMapping("/order/{id}")
    public Result<?> delOrder(@PathVariable int id) {
        try {
            if (orderService.removeById(id)) {
                return Result.success();
            } else {
                return Result.error("删除失败！");
            }
        } catch (Exception e) {
            return Result.error(e);
        }
    }

}
