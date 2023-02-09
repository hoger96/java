package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarDao;
import model.CarService;
import model.CheckDto;

@WebServlet("/update")
public class UpdateChecklistServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		CarDao dao = new CarDao();
		CarService s = new CarService(dao);
		String l_code = request.getParameter("l_code");
		System.out.println(l_code);
		CheckDto dto = s.selectCode(l_code);
		
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("WEB-INF/views/checklist.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String l_code = request.getParameter("l_code");
		String l_tire = request.getParameter("l_tire");
		String l_int = request.getParameter("l_int");
		String l_egr = request.getParameter("l_egr");
		String l_run = request.getParameter("l_run");
		String l_sc = request.getParameter("l_sc");
	}
}
