package cn.uc.daoo;

import cn.uc.beans.Type;
import cn.uc.util.Result;

public interface TypeDao {
    /**
     * 
     *����idɾ������
     */
    Result deleteByPrimaryKey(Integer id);

    /**
     *�������
     */
    Result insert(Type record);

    /**
     * �������
     */
    Result insertSelective(Type record);

    /**
     * ����id������������
     * @param id
     * @return
     */
    Result selectByPrimaryKey(Integer id);

    /**
     * ��������
     * @param record
     * @return
     */
    Result updateByPrimaryKeySelective(Type record);

    /**
     * ����id��������
     * @param record
     * @return
     */
    Result updateByPrimaryKey(Type record);
    
    Result selectAllTypes();
}