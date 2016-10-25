package web.dao.controller.member;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.MemberDAO;
import web.dao.entities.Member;
import web.dao.mybatis.MyBatisMemberDAO;



@WebServlet("/member/manage")
public class ManageController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("i");
		String nickName = request.getParameter("n");
		
		MemberDAO memberDao = new MyBatisMemberDAO();
		List<Member> list = memberDao.getList(id, nickName);


		request.setAttribute("list", list);

		
		// 다른 서블릿을 불러야 한다 JSP를 불러

		// 1. 그냥 부르기 : 네가 새로 해라 (일을 새로 분배할때)
		// response.sendRedirect("notice.jsp");

		// 2. 자원을 공유하면서 부르기 : 일을 이어서 계속 해라
		request.getRequestDispatcher("/WEB-INF/views/member/manage.jsp").forward(request, response); // 디스패처라는
																										// 객체를
																										// 반환해줌.
																										// 리스폰스
																										// 리퀘스트
																										// 도구도
																										// 공유.

	}
}
