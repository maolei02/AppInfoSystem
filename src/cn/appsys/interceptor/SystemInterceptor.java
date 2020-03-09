package cn.appsys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.appsys.pojo.BackendUser;
import cn.appsys.pojo.DevUser;
import cn.appsys.tools.Constants;

public class SystemInterceptor extends HandlerInterceptorAdapter{
	 
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response) throws Exception{
		HttpSession session=request.getSession();
		DevUser devUser=(DevUser) session.getAttribute(Constants.DEV_USER_SESSION);
		BackendUser backendUser=(BackendUser) session.getAttribute(Constants.USER_SESSION);
		
		if(devUser!=null){
			return true;
		}else if(backendUser!=null){
			return true;
		}else {
			response.sendRedirect(request.getContextPath()+"/403.jsp");
			return false;
		}
	}
}
