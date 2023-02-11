package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ScoreDto;
import model.StudentDao;
import model.StudentService;

@WebServlet("/reg")
public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDao dao = new StudentDao();
		StudentService s = new StudentService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String korean = request.getParameter("korean");
		String english = request.getParameter("english");
		String math = request.getParameter("math");
		String history = request.getParameter("history");
		System.out.println(id);
		System.out.println(korean);
		System.out.println(english);
		System.out.println(math);
		System.out.println(history);
		
		StudentDao dao = new StudentDao();
		StudentService s = new StudentService(dao);
		ScoreDto dto = new ScoreDto(id, korean, english, math, history);
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
	}
}
