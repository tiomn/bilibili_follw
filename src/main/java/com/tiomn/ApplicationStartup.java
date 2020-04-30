package com.tiomn;

import com.tiomn.mian.Run;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Date 2020/04/30 15:45
 * @Version v1.0
 * @Author jishupeng
 * @Description TODO
 * @ClassName ApplicationStartup
 */
@SpringBootApplication
public class ApplicationStartup {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStartup.class, args);
        Run.gop();
    }
}
