package cn.uc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import cn.uc.dao.impl.CommentDaoImpl;
import cn.uc.daoo.CommentDao;
import cn.uc.util.Result;

/**
 * Servlet implementation class CommentServlet
 */
@WebServlet("/CommentServlet")
public class CommentServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
   
	CommentDao commentDao=new CommentDaoImpl();
	
	public void adminGetAllComments(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("�����ȡ���е�����");
		Result result = commentDao.getAllComment();
		PrintWriter out = null;
		
		try {
			 out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jsonResult = JSONObject.fromObject(result).toString();
		out.println(jsonResult);
		
	}
	//ɾ��һ������
			public void deleteComment(HttpServletRequest request,HttpServletResponse response){
			  //Ҫ�����û��Ĳ������۵�������Ҫ�õ�request���������response��Ӧ����
			  //����������ȡ���۲���
				String commId=request.getParameter("commId");//��ȡ��������
				System.out.println("ִ��ɾ�����۲�����Ҫɾ��������idΪ��"+commId);
				PrintWriter out=null;
				try {
					out = response.getWriter();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("ɾ���ɹ�:"+commId);
			}
			
			//����һ������
			public void insertComment(HttpServletRequest request,HttpServletResponse response){
			  //Ҫ�����û��Ĳ������۵�������Ҫ�õ�request���������response��Ӧ����
			  //����������ȡ���۲���
				String content=request.getParameter("content");//��ȡ��������
				System.out.println("ִ�в������۲�������������Ϊ��"+content);
				PrintWriter out=null;
				try {
					out = response.getWriter();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("����ɹ�:"+content);
			}	
	

}
