package web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import web.dao.mybatis.EagleSessionFactoryBuilder;

import web.dao.MemberDAO;
import web.dao.entities.Member;

public class MyBatisMemberDAO implements MemberDAO {

	SqlSessionFactory ssf;

	public MyBatisMemberDAO() {
		ssf = EagleSessionFactoryBuilder.getSqlSessionFactory();
	}

	@Override
	public Member get(String id, String nickName) {
		SqlSession session = ssf.openSession(); //
		MemberDAO memberDao = session.getMapper(MemberDAO.class);

		return memberDao.get(id, nickName);
	}



	@Override
	public int insert(Member member) {
		SqlSession session = ssf.openSession(); //
		MemberDAO memberDao = session.getMapper(MemberDAO.class);

		int result = memberDao.insert(member);

		session.commit();
		session.close();

		return result;
	}

	@Override
	public List<Member> getList(String id, String nickName) {
		// TODO Auto-generated method stub
		return null;
	}

}
