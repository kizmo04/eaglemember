package web.dao;

import java.util.List;

import web.dao.entities.Member;

public interface MemberDAO {
	
	Member get(String id, String nickName);
	List<Member> getList(String id, String nickName);
	int insert(Member member);
}
