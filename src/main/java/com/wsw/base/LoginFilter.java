package com.wsw.base;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(urlPatterns = "/api/*", filterName = "loginFilter")
public class LoginFilter  implements Filter{
	
	
	
	 /**
	  * 容器加载的时候调用
	  */
	  @Override
      public void init(FilterConfig filterConfig) throws ServletException {
          System.out.println("init loginFilter");
      }

	  
	  /**
	   * 请求被拦截的时候进行调用
	   */
      @Override
      public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    	  System.out.println("doFilter loginFilter");
    	  
    	  HttpServletRequest req = (HttpServletRequest) servletRequest;
          HttpServletResponse resp = (HttpServletResponse) servletResponse;
          String username = req.getParameter("username");
          
          if ("test".equals(username)) {
        	  filterChain.doFilter(servletRequest,servletResponse);
          } else {
        	  resp.sendRedirect("/index.html");
        	  return;
          }
          
          

      }

      /**
       * 容器被销毁的时候被调用
       */
      @Override
      public void destroy() {
    	  System.out.println("destroy loginFilter");
      }

}
