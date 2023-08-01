package cn.i0xi.guangtong.service.impl;

import cn.i0xi.guangtong.domain.Order;
import cn.i0xi.guangtong.mapper.OrderMapper;
import cn.i0xi.guangtong.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 11429
* @description 针对表【order】的数据库操作Service实现
* @createDate 2023-07-31 13:24:01
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

    @Override
    public List<Order> getOrderList() {
        return null;
    }
}




