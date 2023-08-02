package cn.i0xi.guangtong.dto;

import lombok.Data;

@Data
public class OrderListDto {
    private String username;
    private String phone;
    private int page = 1;
    private int pageSize = -1;
}
