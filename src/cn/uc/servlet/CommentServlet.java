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
		System.out.println("请求获取所有的评论");
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
	//删除一条评论
			public void deleteComment(HttpServletRequest request,HttpServletResponse response){
			  //要处理用户的插入评论的请求，需要用到request请求参数和response响应参数
			  //从请求对象获取评论参数
				String commId=request.getParameter("commId");//获取评论内容
				System.out.println("执行删除评论操作，要删除的评论id为："+commId);
				PrintWriter out=null;
				try {
					out = response.getWriter();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("删除成功:"+commId);
			}
			
			//插入一条评论
			public void insertComment(HttpServletRequest request,HttpServletResponse response){
			  //要处理用户的插入评论的请求，需要用到request请求参数和response响应参数
			  //从请求对象获取评论参数
				String content=request.getParameter("content");//获取评论内容
				System.out.println("执行插入评论操作，评论内容为："+content);
				PrintWriter out=null;
				try {
					out = response.getWriter();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.println("插入成功:"+content);
			}	
	

}
