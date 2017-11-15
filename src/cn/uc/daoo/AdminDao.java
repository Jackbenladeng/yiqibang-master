package cn.uc.daoo;

import cn.uc.util.Result;

public interface AdminDao {
			// 增加管理员
			Result insertAdmin(AdminDao admin);
			
			// 删除
			Result deleteAdmin(int id);
			
			// 修改
			Result updateAdmin(int id);
			
			//查询
			Result selectAllAdmin();
			
			Result selectAdmin1(int id);
			 
			Result  selectAdmin2(int level);
			
			Result selectAdmin3(int state);
			
			
			
}
