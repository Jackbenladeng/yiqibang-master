package cn.uc.daoo;

import cn.uc.beans.Type;
import cn.uc.util.Result;

public interface TypeDao {
    /**
     * 
     *根据id删除类型
     */
    Result deleteByPrimaryKey(Integer id);

    /**
     *添加类型
     */
    Result insert(Type record);

    /**
     * 添加类型
     */
    Result insertSelective(Type record);

    /**
     * 根据id查找类型详情
     * @param id
     * @return
     */
    Result selectByPrimaryKey(Integer id);

    /**
     * 更新类型
     * @param record
     * @return
     */
    Result updateByPrimaryKeySelective(Type record);

    /**
     * 根据id更新类型
     * @param record
     * @return
     */
    Result updateByPrimaryKey(Type record);
    
    Result selectAllTypes();
}