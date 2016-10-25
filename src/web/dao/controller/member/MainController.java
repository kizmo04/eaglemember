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

@WebServlet("/member/main")
public class MainController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*		// TODO Auto-generated method stub
		
		String p = request.getParameter("p");
		String t = request.getParameter("t");
		String q = request.getParameter("q");

		int page = 1;
		String field = "TITLE";
		String query = "";
		
		if (p != null && !p.equals(""))
			page = Integer.parseInt(p);
		
		if (t != null && !t.equals(""))
			field = t;

		
		if (q != null)
			query = q;

		//List<NoticeModel> list = new MyBatisNoticeDao().getList();
		
		MemberDAO MemberDAO = new MyBatisMemberDAO();
		List<Member> list = MemberDAO.getList(page, field, query);
		int count = MemberDAO.getCount(field, query);

		request.setAttribute("list", list);
		request.setAttribute("count", count);
*/		
		// 다른 서블릿을 불러야 한다 JSP를 불러

		// 1. 그냥 부르기 : 네가 새로 해라 (일을 새로 분배할때)
		// response.sendRedirect("notice.jsp");

		// 2. 자원을 공유하면서 부르기 : 일을 이어서 계속 해라
		request.getRequestDispatcher("/WEB-INF/views/member/main.jsp").forward(request, response); // 디스패처라는
																										// 객체를
																										// 반환해줌.
																										// 리스폰스
																										// 리퀘스트
																										// 도구도
																										// 공유.

	}
}
