package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CourtDao;
import model.CourtService;
import model.RegDto;

@WebServlet("/reg")
public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CourtDao dao = new CourtDao();
		CourtService s = new CourtService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String resv_no = request.getParameter("resv_no");
		String resv_date = request.getParameter("resv_date");
		String cust_no = request.getParameter("cust_no");
		String court_no = request.getParameter("court_no");
		
		System.out.println(resv_no);
		System.out.println(resv_date);
		System.out.println(cust_no);
		System.out.println(court_no);
		
		CourtDao dao = new CourtDao();
		CourtService s = new CourtService(dao);
		RegDto dto = new RegDto(resv_no, resv_date, cust_no, court_no);
		
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
		
	}
}
