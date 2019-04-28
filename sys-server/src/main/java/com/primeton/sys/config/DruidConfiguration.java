package com.primeton.sys.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;

@Configuration
public class DruidConfiguration {

	@Bean
	public ServletRegistrationBean statViewServle() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),
				"/druid/*");
		// IP白名单
		// servletRegistrationBean.addInitParameter("allow","192.168.1.12,127.0.0.1");
		// IP黑名单
		// servletRegistrationBean.addInitParameter("deny","192.168.4.23");
		// 控制台用户
		servletRegistrationBean.addInitParameter("loginUsername", "admin");
		servletRegistrationBean.addInitParameter("loginPassword", "123456");
		// 是否能够重置数据
		servletRegistrationBean.addInitParameter("resetEnable", "false");
		return servletRegistrationBean;
	}
}
