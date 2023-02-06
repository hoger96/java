package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LectureDao;
import model.LectureService;
import model.RegDto;

@WebServlet("/reg")
public class regServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LectureDao dao = new LectureDao();
		LectureService s = new LectureService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String s_id = request.getParameter("s_id");
		String s_name = request.getParameter("s_name");
		String s_grade = request.getParameter("s_grade");
		String t_id = request.getParameter("t_id");
		String weekday = request.getParameter("weekday");
		String start_h = request.getParameter("start_h");
		String end_h = request.getParameter("end_h");
		
		LectureDao dao = new LectureDao();
		LectureService s = new LectureService(dao);
		
		RegDto dto = new RegDto(s_id, s_name, s_grade, t_id, weekday, start_h, end_h);
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
	}

}
