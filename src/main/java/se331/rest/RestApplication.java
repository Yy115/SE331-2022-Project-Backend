package se331.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;
import java.util.Date;
//@SpringBootApplication(exclude= {SecurityAutoConfiguration.class })
@SpringBootApplication
public class RestApplication {

    @PostConstruct
    public void init(){
//		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        System.out.println("Spring boot application running in GMT timezone :"+new Date());
        System.setProperty("proxyType", "4"); // 设置代理类型，4应该是指http
        System.setProperty("proxyPort","10900"); // 设置代理的端口号
        System.setProperty("proxyHost", "127.0.0.1"); // 设置代理的ip地址
        System.setProperty("proxySet", "true"); // 使代理生效
    }

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000","http://localhost:4000","http://192.168.31.209:4000")
                        .exposedHeaders("x-total-count");

            }
        };
    }


}
