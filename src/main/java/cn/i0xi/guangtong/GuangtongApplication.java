package cn.i0xi.guangtong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.i0xi.guangtong.mapper")
public class GuangtongApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuangtongApplication.class, args);
    }

}
