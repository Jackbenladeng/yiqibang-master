package cn.uc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println("���յ�����"+name);
		response.getWriter().println("��������Ӧ���������ݣ���������û������");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

	
	//���ڷ��������оͱ���
	//1.дservlet�͹�������ʱ����һ��һ�����ƺ�������һ��
	//����ϴ�����û������α����ˣ��Ǿ�������½���servlet����������
	
	//2.tomcat���ó�����
	//�ѷ������ϲ������Ŀȫ���Ƴ��������з�����������Ļ�˵��������ˣ����û����˵����servlet����filter������
}
