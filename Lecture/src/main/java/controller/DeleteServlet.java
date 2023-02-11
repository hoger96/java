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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String s_id = request.getParameter("s_id");
		LectureDao dao = new LectureDao();
		LectureService s = new LectureService(dao);
		
		System.out.println(s_id);
		s.delete(s_id);
		
		response.sendRedirect("index.jsp");
	}
	
}
