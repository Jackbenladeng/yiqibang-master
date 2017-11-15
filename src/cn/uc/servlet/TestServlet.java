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
		System.out.println("接收到参数"+name);
		response.getWriter().println("这是我响应的中文内容，看看还有没有乱码");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

	
	//对于服务器运行就报错：
	//1.写servlet和过滤器的时候尽量一个一个完善好再做下一个
	//如果上次运行没报错，这次报错了，那就是这个新建的servlet里面有问题
	
	//2.tomcat配置出错了
	//把服务器上部署的项目全部移除掉，运行服务器，报错的话说明服务错了，如果没报错说明是servlet或者filter出错了
}
