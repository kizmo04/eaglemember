package web.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EagleSessionFactoryBuilder {

	static String src ="web/dao/mybatis/config.xml"; //��������ȭ
	static SqlSessionFactory ssf = null;
	//�������� �ʱ�ȭ
	static{
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream(src);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ssf = new SqlSessionFactoryBuilder().build(is); //������������ �������� �������ȭ
		
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		// TODO Auto-generated method stub
		return ssf;
	}
	
}
