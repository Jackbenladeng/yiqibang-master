package cn.uc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	public void adminLogin(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub

		String username =request.getParameter("username");
		String password =request.getParameter("password");
		String code=request.getParameter("code");
		
		//�������
		System.out.println(username+"-"+password+"-"+code);
		
		//��ȡ��ȷ����֤��
		HttpSession session=request.getSession();
		String ccode=String.valueOf(session.getAttribute("ccode"));
		try {
			if(code!=null&&code.equals(ccode)){
				System.out.println("��¼");
				if("xiaoming".equals(username)&&"1234".equals(password)){
					response.sendRedirect(request.getContextPath()+"/Background login.jsp");
				}else{
					session.setAttribute("tip", "�û����������");
					response.sendRedirect(request.getContextPath()+"/login.jsp");
				}
			}else{
				session.setAttribute("tip", "��֤�����");
				response.sendRedirect(request.getContentType()+"/login.jsp?ifFirst=false");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��תʧ��");
		}
		
				
	}

}
	