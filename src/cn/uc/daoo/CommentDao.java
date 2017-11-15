package cn.uc.daoo;

import cn.uc.beans.Comment;
import cn.uc.util.Result;

public interface CommentDao {


	// ����
	Result insertComment(Comment comm);
	
	// ɾ��
	Result deleteByCondition(Comment comm );
	
	// �޸�
	Result updateComment(int id);
	
	//��ѯ
	Result selectAllComment();
	
	Result selectComment(int id);
	
	//��ȡ��������
	Result getAllComment();

	


}
