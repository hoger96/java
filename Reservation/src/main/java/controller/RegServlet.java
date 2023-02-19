package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RegDto;
import model.ResDao;
import model.ResService;

@WebServlet("/reg")
public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ResDao dao = new ResDao();
		ResService s = new ResService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String rev_id = request.getParameter("rev_id");
		String join_no = request.getParameter("join_no");
		String kind = request.getParameter("kind");
		String rev_dt = request.getParameter("rev_dt");
		String certification = request.getParameter("certification");
		String ck = request.getParameter("ck");
		
		System.out.println(rev_id);
		System.out.println(join_no);
		System.out.println(kind);
		System.out.println(rev_dt);
		System.out.println(certification);
		System.out.println(ck);
		
		ResDao dao = new ResDao();
		ResService s = new ResService(dao);
		RegDto dto = new RegDto(rev_id, join_no, kind, rev_dt, certification, ck);
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
		
	}
}
