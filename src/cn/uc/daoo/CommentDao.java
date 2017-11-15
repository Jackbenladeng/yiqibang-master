package cn.uc.daoo;

import cn.uc.beans.Comment;
import cn.uc.util.Result;

public interface CommentDao {


	// 增加
	Result insertComment(Comment comm);
	
	// 删除
	Result deleteByCondition(Comment comm );
	
	// 修改
	Result updateComment(int id);
	
	//查询
	Result selectAllComment();
	
	Result selectComment(int id);
	
	//获取所有评论
	Result getAllComment();

	


}
