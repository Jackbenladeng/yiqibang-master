package cn.uc.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.beans.Type;
import cn.uc.daoo.TypeDao;
import cn.uc.util.Constants;
import cn.uc.util.MyBatisUtils;
import cn.uc.util.Result;



public class TypeDaoImpl  implements TypeDao{

	@Override
	public Result deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result insert(Type record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result insertSelective(Type record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectByPrimaryKey(Integer id) {
	Result result = new Result();
	SqlSession session = MyBatisUtils.openSession();
	Type type = session.selectOne(Constants.typeMapper_selectByPrimaryKey,id);
	session.close();
	if(type!=null){
		result.setRetCode(Constants.RETCODE_SUCCESS);
		result.setRetData(type);
		result.setRetMsg(true);
	}else{
		result.setRetCode(Constants.RETCODE_FAILED);
		result.setRetMsg(false);
	}
	
		return result;
	}

	@Override
	public Result updateByPrimaryKeySelective(Type record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result updateByPrimaryKey(Type record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectAllTypes() {
		Result result=new Result();
		SqlSession session=MyBatisUtils.openSession();
		List<Type> types = session.selectList(Constants.typeMapper_selectAll);
		session.close();
		if(types!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(types);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}
	}


