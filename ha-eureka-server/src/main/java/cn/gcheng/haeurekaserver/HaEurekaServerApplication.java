package cn.gcheng.haeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LIUGUOCHENG
 */
@SpringBootApplication
@EnableEurekaServer
public class HaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaEurekaServerApplication.class, args);
    }

}
