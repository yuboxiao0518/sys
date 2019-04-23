package com.primeton.sys.client.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.primeton.sys.client.fallback.SysClientFallback;

@FeignClient(value = "sys-server",fallback=SysClientFallback.class)
public interface SysClient {
	@GetMapping(value = "sys/msg")
	String getMsg();
	
	@GetMapping(value="admin/log/queryPage")
	String queryPage();

}
