package cn.uc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.uc.dao.impl.TypeDaoImpl;
import cn.uc.daoo.TypeDao;
import cn.uc.util.Result;
import cn.uc.util.WriteResultToClient;

/**
 * Servlet implementation class TypeServlet
 */
@WebServlet("/TypeServlet")
public class TypeServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	TypeDao typeDao = new TypeDaoImpl();
	
  public void adminGetTypeById(HttpServletRequest request,HttpServletResponse response){
	  int typeid = Integer.parseInt(request.getParameter("id"));
	  Result result = typeDao.selectByPrimaryKey(typeid);
	  WriteResultToClient.writeMethod(result, response);
  }
  
  public void adminSelectAllTypes(HttpServletRequest request,HttpServletResponse response){
	  Result result = typeDao.selectAllTypes();
	  WriteResultToClient.writeMethod(result, response);
  }

}
