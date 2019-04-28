package com.primeton.sys.client.fallback;

import org.springframework.stereotype.Component;

import com.primeton.sys.client.controller.SysClient;

@Component
public class SysClientFallback implements SysClient {

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return "sorry";
	}

	@Override
	public String queryPage() {
		// TODO Auto-generated method stub
		return "sorry";
	}

}
