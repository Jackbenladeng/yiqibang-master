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
		//�������е�δ��¼�Ĺ���Ա����
		
		
		String method = request.getParameter("method");
		if(method==null){
			System.out.println("�����������");
			return;
		}else{
			//�涨���еĹ���Ա�����ķ���method����Admin����
			if(method.endsWith("Admin")){
				//�������Ա�Ĳ���
				HttpSession session=((HttpServletRequest)request).getSession();
			    //��session�����ȡ��¼�Ĺ���Ա����
				//������ڣ�˵������Ա�Ѿ��ڵ�¼״̬
				//���粻���ڣ�˵������Աû��¼��������¼ҳ�棬������¼����¼��ɺ󽫹���Ա�������Ϊsession��attribute
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
