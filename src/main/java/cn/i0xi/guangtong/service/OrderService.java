package cn.i0xi.guangtong.service;

import cn.i0xi.guangtong.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 11429
* @description 针对表【order】的数据库操作Service
* @createDate 2023-07-31 13:24:01
*/
public interface OrderService extends IService<Order> {

    List<Order> getOrderList();

}
