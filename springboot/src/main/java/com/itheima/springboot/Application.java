package com.itheima.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author Administrator
 *
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		//第一种run方式
		//SpringApplication.run(Application.class, args);
		
		//第二种方式
		//创建application对象
		SpringApplication application = new SpringApplication(Application.class);
		//设置广告关闭
		application.setBannerMode(Mode.OFF);
		//运行
		application.run(args);
	}
}
