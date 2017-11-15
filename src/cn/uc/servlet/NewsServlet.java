package cn.uc.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.ibatis.session.SqlSession;

import cn.uc.beans.News;
import cn.uc.dao.impl.NewsDaoImpl;
import cn.uc.daoo.NewsDao;
import cn.uc.util.Result;
import cn.uc.util.WriteResultToClient;

/**
 * Servlet implementation class NewsServlet
 */
@WebServlet("/NewsServlet")
public class NewsServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
    
	NewsDao newsDao = new NewsDaoImpl();
	public void selectAllNews(HttpServletRequest request, HttpServletResponse response)  {
		
		Result result = newsDao.selectAllNews();
		PrintWriter out=null;
		try {
				out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jsonResult = JSONObject.fromObject(result).toString();
		out.println(jsonResult);
		
	}
	
	public void adminDeleteNewsById(HttpServletRequest request,HttpServletResponse response){
		int newsid= Integer.parseInt(request.getParameter("id"));
		Result result = newsDao.deleteByPrimaryKey(newsid);
		WriteResultToClient.writeMethod(result, response);
	
	}
	
	public void adminGetNewsByLike(HttpServletRequest request,HttpServletResponse response){
		String likeStr = request.getParameter("likeStr");
		Result result =newsDao.selectNewsByLike("%"+likeStr+"%");
		WriteResultToClient.writeMethod(request, response);
		
		
	}
	
	public void adminInsertNews(HttpServletRequest request,HttpServletResponse response){
		String title = request.getParameter("title");
		String source = request.getParameter("source");
		String author = request.getParameter("author");
		String content = request.getParameter("content");
		String editorValue = request.getParameter("editorValue ");
		int typeid = Integer.parseInt(request.getParameter("typeid"));
		boolean ifHot = Boolean.parseBoolean(request.getParameter("ifHot"));
		
		News news = new News();
		news.setN_author(author);
		news.setN_content(editorValue);
		news.setN_createtime(new Date());
		news.setN_Ifhot(ifHot);
		news.setN_source(source);
		news.setN_title(title);
		news.setN_content(content);
		news.setT_t_id(typeid);
		
		Result result = newsDao.insertNews(news);
		
		WriteResultToClient.writeMethod(result, response);
		
		
		
		
		
	}
		
	}

	


