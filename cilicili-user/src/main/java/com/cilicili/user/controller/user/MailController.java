package com.cilicili.user.controller.user;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cilicili.user.service.impl.user.MailService;

@RestController
public class MailController {

	 @Autowired
	 private MailService mailService;
	 
	    @RequestMapping("/getCheckCode")
	    @ResponseBody
	    public String getCheckCode(String email){
	        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
	        String message = "欢迎注册Cilicili,您的注册验证码为："+checkCode;
	        try {
	            mailService.sendSimpleMail(email, "Cilicili注册验证码", message);
	            System.out.println("8688");
	        }catch (Exception e){
	            return "";
	        }
	        return checkCode;   
	    }

}
