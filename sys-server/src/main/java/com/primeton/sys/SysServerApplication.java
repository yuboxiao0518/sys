package com.primeton.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.primeton.sys.mapper")
public class SysServerApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SysServerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SysServerApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "login";
	}

	@RequestMapping("/404")
	String notFound() {
		return "common/404";
	}

	@RequestMapping("/500")
	String error() {
		return "common/500";
	}

}
