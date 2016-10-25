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
		// �ٸ� ������ �ҷ��� �Ѵ� JSP�� �ҷ�

		// 1. �׳� �θ��� : �װ� ���� �ض� (���� ���� �й��Ҷ�)
		// response.sendRedirect("notice.jsp");

		// 2. �ڿ��� �����ϸ鼭 �θ��� : ���� �̾ ��� �ض�
		request.getRequestDispatcher("/WEB-INF/views/member/main.jsp").forward(request, response); // ����ó���
																										// ��ü��
																										// ��ȯ����.
																										// ��������
																										// ������Ʈ
																										// ������
																										// ����.

	}
}
