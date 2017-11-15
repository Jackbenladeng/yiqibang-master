package cn.uc.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.uc.beans.Pic;
import cn.uc.daoo.PicDao;
import cn.uc.util.Constants;
import cn.uc.util.MyBatisUtils;
import cn.uc.util.Result;

public class PicDaoImpl implements PicDao {

	@Override
	public Result insertPic(Pic pic) {
		Result result=new Result();
		SqlSession session=MyBatisUtils.openSession();
		int row = session.insert(Constants.picMapper_insertPic,pic);
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
	public Result deleteByCondition(Pic  pic) {
		Result result=new Result();
		SqlSession session = MyBatisUtils.openSession();
		int row = session.delete(Constants.picMapper_deleteByCondition,pic);
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
	public Result updatePic(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectAllPic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectPic1(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectPic2(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectPic3(String info) {
		// TODO Auto-generated method stub
		return null;
	}

}
