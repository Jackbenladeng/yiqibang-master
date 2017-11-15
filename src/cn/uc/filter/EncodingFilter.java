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
		//init����������/��ʼ���Ļص�����
		//FilterConfig����filterConfig�Ǹù�������������Ϣ��װ����
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		    // doFilter�������ݺ�����
		      request.setCharacterEncoding("UTF-8");
		      response.setContentType("text/html;charset=UTF-8");
		      
		      //��������ɵ�ʱ��---��������һ��������
		      //FilterChain chain ����������
		      chain.doFilter(request, response);//������һ��������
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//destroy�����������ٵĻص�����
	}

}
