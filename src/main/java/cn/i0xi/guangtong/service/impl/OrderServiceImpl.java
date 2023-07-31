package cn.i0xi.guangtong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.i0xi.guangtong.domain.Order;
import cn.i0xi.guangtong.service.OrderService;
import cn.i0xi.guangtong.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 11429
* @description 针对表【order】的数据库操作Service实现
* @createDate 2023-07-31 13:24:01
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




