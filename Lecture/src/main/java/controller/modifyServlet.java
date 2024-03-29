package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LectureDao;
import model.LectureDto;
import model.LectureService;
import model.ModifyDto;

@WebServlet("/modify")
public class modifyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LectureDao dao = new LectureDao();
		LectureService s = new LectureService(dao);
		String s_id = request.getParameter("s_id");
		System.out.println(s_id);
		
		
		LectureDto dto = s.selectId(s_id);
		System.out.println(dto);
		System.out.println(s_id);
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("WEB-INF/views/modify.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String s_id = request.getParameter("s_id");
		String s_name = request.getParameter("s_name");
		String t_id = request.getParameter("t_id");
		String s_grade = request.getParameter("s_grade");
		String weekday = request.getParameter("weekday");
		String start_h = request.getParameter("start_h");
		String end_h = request.getParameter("end_h");
		
		LectureDao dao = new LectureDao();
		LectureService s = new LectureService(dao);
		
		ModifyDto dto = new ModifyDto(s_id, s_name, t_id, s_grade, weekday, start_h, end_h );
		s.lectureUpdate(dto);
		
		response.sendRedirect("index.jsp");
	}
}
