package cn.gcheng.haeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HaEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaEurekaClientApplication.class, args);
    }

}
