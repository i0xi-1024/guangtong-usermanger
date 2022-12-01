package cn.i0xi.guangtong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.i0xi.guangtong.domain.Users;
import cn.i0xi.guangtong.service.UsersService;
import cn.i0xi.guangtong.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 11429
* @description 针对表【guangtong_users】的数据库操作Service实现
* @createDate 2022-12-01 13:36:44
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




