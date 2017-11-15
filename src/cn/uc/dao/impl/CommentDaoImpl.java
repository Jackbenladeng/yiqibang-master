package cn.uc.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.beans.Comment;
import cn.uc.daoo.CommentDao;
import cn.uc.util.Constants;
import cn.uc.util.MyBatisUtils;
import cn.uc.util.Result;

public class CommentDaoImpl implements CommentDao {

	@Override
	public Result insertComment(Comment comm) {
		Result result=new Result();
		SqlSession session=MyBatisUtils.openSession();
		int row = session.insert(Constants.commentMapper_insert,comm);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(comm);
			result.setRetMsg(true);
			
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
	}
		return result; 

}
		
	

	@Override
	public Result deleteByCondition(Comment comm) {
		Result result = new Result();
		SqlSession session= MyBatisUtils.openSession();
		int row = session.delete(Constants.commentMapper_deleteByCondition,comm);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		
		return result;
	}

	@Override
	public Result updateComment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectAllComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectComment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result getAllComment() {
		Result result = new Result();
		SqlSession session = MyBatisUtils.openSession();
		List<Comment> commentList = session.selectList(Constants.commentMapper_selectAll);
		session.close();
		if(commentList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetData(commentList);
			result.setRetMsg(true);
		}else{
			result.setRetMsg(false);
			result.setRetCode(Constants.RETCODE_FAILED);
		}
		return result;

	}

}
