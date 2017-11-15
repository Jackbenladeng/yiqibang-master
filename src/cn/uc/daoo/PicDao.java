package cn.uc.daoo;

import cn.uc.beans.Pic;
import cn.uc.util.Result;

public interface PicDao {
			// 增加
			Result insertPic(Pic pic);
			
			// 删除
			Result deleteByCondition(Pic pic);
			
			// 修改
			Result updatePic(int id);
			
			//查询
			Result selectAllPic();
			
			Result selectPic1(int id);
			 
			Result selectPic2(String author);
			
			Result selectPic3(String info);
	
	
	
	
	
	
	
	
	
	
	
	
}
