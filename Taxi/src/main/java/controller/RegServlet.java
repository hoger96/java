package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RegDto;
import model.TaxiDao;
import model.TaxiService;

@WebServlet("/reg")
public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TaxiDao dao = new TaxiDao();
		TaxiService s = new TaxiService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		String regno = request.getParameter("regno");
		String regtime = request.getParameter("regtime");
		String regdate = request.getParameter("regdate");
		String cusno = request.getParameter("cusno");
		String startpoint = request.getParameter("startpoint");
		String destination = request.getParameter("destination");
		String taxino = request.getParameter("taxino");
		String state = request.getParameter("state");
		
		TaxiDao dao = new TaxiDao();
		TaxiService s = new TaxiService(dao);
		RegDto dto = new RegDto(regno, regtime, regdate, cusno, startpoint, destination, taxino, state);
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
	}
}
