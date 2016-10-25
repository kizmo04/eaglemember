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

		
		// �ٸ� ������ �ҷ��� �Ѵ� JSP�� �ҷ�

		// 1. �׳� �θ��� : �װ� ���� �ض� (���� ���� �й��Ҷ�)
		// response.sendRedirect("notice.jsp");

		// 2. �ڿ��� �����ϸ鼭 �θ��� : ���� �̾ ��� �ض�
		request.getRequestDispatcher("/WEB-INF/views/member/manage.jsp").forward(request, response); // ����ó���
																										// ��ü��
																										// ��ȯ����.
																										// ��������
																										// ������Ʈ
																										// ������
																										// ����.

	}
}
