package com.briup.apps.pul.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.pul.bean.Login;
import com.briup.apps.pul.service.ILoginService;
import com.briup.apps.pul.util.MsgResponse;

import io.swagger.annotations.Api;
@Api(description="管理员登录信息接口")
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@GetMapping("findAllLogin")
	public MsgResponse findAllLogin(){
	
	try{
		List<Login> list = loginService.findAll();
		return MsgResponse.success("success", list);
	}catch(Exception e){
		e.printStackTrace();
		return MsgResponse.error(e.getMessage());
	}
	}
}
