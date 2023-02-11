package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SSlistDto;
import model.StudentDao;
import model.StudentService;
import model.TotalDto;

@WebServlet("/scorelist")
public class TotalServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		StudentService s = new StudentService(dao);
		
		ArrayList<SSlistDto> list = s.selectmy();
		TotalDto dto = s.selectTotal();
		
		request.setAttribute("list", list);
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("WEB-INF/views/scorelist.jsp").forward(request, response);
	}
}
