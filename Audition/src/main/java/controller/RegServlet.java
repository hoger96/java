package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AuditionDao;
import model.AuditionService;
import model.PersonDto;

@WebServlet("/reg.go")
public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AuditionDao dao = new AuditionDao();
		AuditionService s = new AuditionService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String join_id = request.getParameter("join_id");
		String join_nm = request.getParameter("join_nm");
		String birth_y = request.getParameter("birth_y");
		String birth_m = request.getParameter("birth_m");
		String birth_d = request.getParameter("birth_d");
		String gender = request.getParameter("gender");
		String specialty = request.getParameter("specialty");
		String charm = request.getParameter("charm");
		
		AuditionDao dao = new AuditionDao();
		AuditionService s = new AuditionService(dao);
	
		PersonDto dto = new PersonDto(join_id, join_nm, birth_y+birth_m+birth_d, gender, specialty, charm);
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
	}
}
