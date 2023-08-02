package cn.i0xi.guangtong.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Objects;

@Slf4j
public class Paging {
    public static <T> Page<T> startPage() {
        // 此为静态获取HttpServletRequest的方法, 建议封装工具类, 此处为了演示, 故而如此处理
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        Page<T> page;
        try {
            String pageNum = request.getParameter("pageNum");
            String pageSize = request.getParameter("pageSize");
            if (pageNum == null) {
                pageNum = "1";
            }
            if (pageSize == null) {
                pageSize = "20";
            }
            // 这里可以限制pageSize/pageNum大小, 还可以处理一下排序等内容
            page = new Page<>(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        } catch (Exception e) {
            log.error("获取分页信息失败, 使用默认值", e);
            page = new Page<>(1, 20);
        }
        return page;
    }
}
