package cn.uc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/*")
public class EncodingFilter implements Filter{

	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		//init过滤器创建/初始化的回掉方法
		//FilterConfig对象filterConfig是该过滤器的配置信息封装对象
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		    // doFilter过滤内容和流程
		      request.setCharacterEncoding("UTF-8");
		      response.setContentType("text/html;charset=UTF-8");
		      
		      //当过滤完成的时候---调用下面一个过滤器
		      //FilterChain chain 过滤器的链
		      chain.doFilter(request, response);//调用下一个过滤器
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//destroy过滤器的销毁的回掉方法
	}

}
