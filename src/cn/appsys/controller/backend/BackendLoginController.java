package cn.appsys.controller.backend;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.BackendUser;
import cn.appsys.service.backend.BackendService;

@Controller
@RequestMapping("/manager")
public class BackendLoginController {
	@Resource
	private BackendService backendService;
	
	@RequestMapping("/login")
	public String login(){
		return "backendlogin";
	}
	
	@RequestMapping("/dologin")
	public String dologin(@RequestParam("userCode") String userCode,
			@RequestParam("userPassword") String userPassword,HttpSession session,HttpServletRequest request){
		BackendUser user= backendService.login(userCode);
		if(user.getUserPassword().equals(userPassword)){
			session.setAttribute("userSession", user);
			return "/backend/main";
		}else{
			request.setAttribute("error", "用户名或密码错误");
			return "backendlogin";
		}
	}
}
