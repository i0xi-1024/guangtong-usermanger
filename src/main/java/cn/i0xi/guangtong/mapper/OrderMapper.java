package cn.i0xi.guangtong.mapper;

import cn.i0xi.guangtong.domain.Order;
import cn.i0xi.guangtong.dto.OrderListDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
* @author 11429
* @description 针对表【order】的数据库操作Mapper
* @createDate 2023-07-31 13:24:01
* @Entity cn.i0xi.guangtong.domain.Order
*/
public interface OrderMapper extends BaseMapper<Order> {

    List<Order> selectOrderList(IPage<Order> page, OrderListDto orderListDto);
}




