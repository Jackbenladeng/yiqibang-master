package cn.uc.daoo;

import cn.uc.beans.Pic;
import cn.uc.util.Result;

public interface PicDao {
			// ����
			Result insertPic(Pic pic);
			
			// ɾ��
			Result deleteByCondition(Pic pic);
			
			// �޸�
			Result updatePic(int id);
			
			//��ѯ
			Result selectAllPic();
			
			Result selectPic1(int id);
			 
			Result selectPic2(String author);
			
			Result selectPic3(String info);
	
	
	
	
	
	
	
	
	
	
	
	
}
