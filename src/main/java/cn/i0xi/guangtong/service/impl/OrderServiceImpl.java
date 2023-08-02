package cn.i0xi.guangtong.service.impl;

import cn.i0xi.guangtong.domain.Order;
import cn.i0xi.guangtong.dto.OrderListDto;
import cn.i0xi.guangtong.mapper.OrderMapper;
import cn.i0xi.guangtong.service.OrderService;
import cn.i0xi.guangtong.utils.Paging;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author 11429
 * @description 针对表【order】的数据库操作Service实现
 * @createDate 2023-07-31 13:24:01
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
        implements OrderService {

    @Override
    public IPage<Order> getOrderList(OrderListDto orderListDto) {
        if (StringUtils.hasText(orderListDto.getUsername())) {
            orderListDto.setUsername("%" + orderListDto.getUsername() + "%");
        }
        if (StringUtils.hasText(orderListDto.getPhone())) {
            orderListDto.setPhone("%" + orderListDto.getPhone());
        }
        return getBaseMapper().selectOrderList(Paging.startPage(), orderListDto);
    }
}




