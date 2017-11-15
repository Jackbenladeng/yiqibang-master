package cn.uc.daoo;

import javax.servlet.http.HttpServletRequest;

import cn.uc.beans.News;
import cn.uc.util.Pagination;
import cn.uc.util.Result;



public interface NewsDao {
	// dao核心---将项目中，对这个javaBean的所有需要的操作都放在这里，给servlet控制器调用

		//将所有的dao的方法的返回值统一，然后响应给客户端的都是同一个对象
		
		// 增加新闻
		Result insertNews(News news);
		
		// 删除新闻
		 Result deleteByPrimaryKey(Integer id);

		
		// 修改新闻---修改评论人数 修改阅读人数 修改其他
		Result updateCommNum(int newsid,int num);
		
		Result updateViewCount(int newsid,int count);
		
		Result updateNews(NewsDao news);
		
		// 修改新闻图片
		Result updateNewsPic(int newsid,int picId,HttpServletRequest request);

		// 查询新闻---查询所有 根据分类id获取新闻 根据新闻id获取一条新闻详情
		Result selectAllNewsCount();
		
		Result selectAllNews();
		
		Result selectLimitAllNews(Pagination page);
		
		Result selectNewsByTypeId(int typeId);
		
		Result selectNewsById(int newsid);
		
		Result selectLimitNewsByCatId(int catId,Pagination page);
		
		// 根据用户输入信息模糊查询新闻列表
		Result selectNewsByLike(String likeStr);
		
		// 上传新闻图片
		Result insertNewsPic(HttpServletRequest request);

		
	

	
}
