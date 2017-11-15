package cn.uc.daoo;

import javax.servlet.http.HttpServletRequest;

import cn.uc.beans.News;
import cn.uc.util.Pagination;
import cn.uc.util.Result;



public interface NewsDao {
	// dao����---����Ŀ�У������javaBean��������Ҫ�Ĳ��������������servlet����������

		//�����е�dao�ķ����ķ���ֵͳһ��Ȼ����Ӧ���ͻ��˵Ķ���ͬһ������
		
		// ��������
		Result insertNews(News news);
		
		// ɾ������
		 Result deleteByPrimaryKey(Integer id);

		
		// �޸�����---�޸��������� �޸��Ķ����� �޸�����
		Result updateCommNum(int newsid,int num);
		
		Result updateViewCount(int newsid,int count);
		
		Result updateNews(NewsDao news);
		
		// �޸�����ͼƬ
		Result updateNewsPic(int newsid,int picId,HttpServletRequest request);

		// ��ѯ����---��ѯ���� ���ݷ���id��ȡ���� ��������id��ȡһ����������
		Result selectAllNewsCount();
		
		Result selectAllNews();
		
		Result selectLimitAllNews(Pagination page);
		
		Result selectNewsByTypeId(int typeId);
		
		Result selectNewsById(int newsid);
		
		Result selectLimitNewsByCatId(int catId,Pagination page);
		
		// �����û�������Ϣģ����ѯ�����б�
		Result selectNewsByLike(String likeStr);
		
		// �ϴ�����ͼƬ
		Result insertNewsPic(HttpServletRequest request);

		
	

	
}
