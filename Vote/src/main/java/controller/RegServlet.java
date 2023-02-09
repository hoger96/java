package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RegDto;
import model.VoteDao;
import model.VoteService;

@WebServlet("/reg")
public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			VoteDao dao = new VoteDao();
			VoteService s = new VoteService(dao);
			
			request.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		String v_jumin = request.getParameter("v_jumin");
		String v_name = request.getParameter("v_name");
		String v_area = request.getParameter("v_area");
		String v_time = request.getParameter("v_time");
		String v_confirm = request.getParameter("v_confirm");
		String n_no = request.getParameter("n_no");
		
		System.out.print(v_jumin);
		VoteDao dao = new VoteDao();
		VoteService s = new VoteService(dao);
		RegDto dto = new RegDto(v_jumin, v_name, v_area, v_time, v_confirm, n_no);
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
	}
}
