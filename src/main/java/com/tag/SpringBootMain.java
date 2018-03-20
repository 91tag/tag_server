package com.tag;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 启动项
 * @author cx
 * @Time 2018年3月14日 下午5:15:13
 */
@SpringBootApplication
@MapperScan("com.tag.dao")
@EnableAsync
public class SpringBootMain extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMain.class, args);
	}
	
	// tomcat war启动  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(SpringBootMain.class);
    }
}
