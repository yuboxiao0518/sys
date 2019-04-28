package com.primeton.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.primeton.sys.annotation.Authority;

@Controller
@RequestMapping("/admin/vue/")
public class VueController extends BaseController {
	
	@RequestMapping("mainPage")
	public String vuePage() {
		return "vue/vue_main";
	}

}
