package cn.uc.daoo;

import cn.uc.util.Result;

public interface AdminDao {
			// ���ӹ���Ա
			Result insertAdmin(AdminDao admin);
			
			// ɾ��
			Result deleteAdmin(int id);
			
			// �޸�
			Result updateAdmin(int id);
			
			//��ѯ
			Result selectAllAdmin();
			
			Result selectAdmin1(int id);
			 
			Result  selectAdmin2(int level);
			
			Result selectAdmin3(int state);
			
			
			
}
