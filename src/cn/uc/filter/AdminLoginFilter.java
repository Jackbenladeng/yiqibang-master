package cn.uc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@WebFilter("/admin/*")
public class AdminLoginFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//拦截所有的未登录的管理员操作
		
		
		String method = request.getParameter("method");
		if(method==null){
			System.out.println("请求参数错误");
			return;
		}else{
			//规定所有的管理员操作的方法method都以Admin结束
			if(method.endsWith("Admin")){
				//请求管理员的操作
				HttpSession session=((HttpServletRequest)request).getSession();
			    //从session里面获取登录的管理员对象
				//假如存在，说明管理员已经在登录状态
				//假如不存在，说明管理员没登录，跳到登录页面，让它登录，登录完成后将管理员对象添加为session的attribute
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
