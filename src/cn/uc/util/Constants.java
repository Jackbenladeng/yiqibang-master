package cn.uc.util;

/**
 * �ַ����Ĳ���ƴ����
 * @author 12644
 *
 */
public class Constants {

	//��Ӧ��
	public static final int RETCODE_SUCCESS=0;
	public static final int RETCODE_FAILED=2000;
	
	//����ӳ���ļ�.xml�İ��ĸ�·��
	 public static final String root="cn.uc.mapper";
	 //����mapperӳ���ļ�������
	 public static final String commentMapper=".CommentMapper";
	 public static final String newsMapper=".NewsMapper";
	 public static final String typeMapper=".TypeMapper";
	 public static final String picMapper=".PicMapper";
	 //���������sql����id����
	 public static final String selectAll=".selectAll";
	 public static final String selectByLike=".selectByLike";
	 public static final String selectByPrimaryKey=".selectByPrimaryKey";
	 public static final String insert=".insert";
	 public static final String update=".update";
	 public static final String insertPic=".insertPic";
	 public static final String insertNews=".insertNews";
	 public static final String deleteByCondition=".deleteByCondition";
	 public static final String deleteByPrimaryKey=".deleteByPrimaryKey";
	 
	 //...
	 
	 //Comment���۵Ĳ������·��
	 public static final String commentMapper_selectAll=root+commentMapper+selectAll;
	 public static final String commentMapper_deleteByCondition=root+commentMapper+deleteByCondition;
	 public static final String commentMapper_insert=root+commentMapper+insert;
	 
	 
	 //News���ŵĲ������·��
	 public static final String newsMapper_selectAll=root+newsMapper+selectAll;
	 public static final String newsMapper_insertNews=root+newsMapper+insertNews;
	 public static final String newsMapper_deleteByPrimaryKey=root+newsMapper+deleteByPrimaryKey;
	 public static final String newsMapper_selectByLike=root+newsMapper+selectByLike;
	 
	 //PicͼƬ
	 public static final String picMapper_deleteByCondition=root+picMapper+deleteByCondition;
	 public static final String picMapper_insertPic=root+picMapper+insertPic;


	 //Type���ŷ���Ĳ������·��
	 public static final String typeMapper_selectByPrimaryKey=root+typeMapper+selectByPrimaryKey;
	 public static final String typeMapper_selectAll=root+typeMapper+selectAll;



}
