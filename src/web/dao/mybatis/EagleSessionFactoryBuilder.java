package web.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EagleSessionFactoryBuilder {

	static String src ="web/dao/mybatis/config.xml"; //전역변수화
	static SqlSessionFactory ssf = null;
	//전역변수 초기화
	static{
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream(src);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ssf = new SqlSessionFactoryBuilder().build(is); //전역변수에서 쓰기위해 멤버변수화
		
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		// TODO Auto-generated method stub
		return ssf;
	}
	
}
