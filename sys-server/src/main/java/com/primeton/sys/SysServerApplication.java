package com.primeton.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.primeton.sys.mapper")
public class SysServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysServerApplication.class, args);
	}

}
