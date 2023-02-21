package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CourtDao;
import model.CourtDto;
import model.CourtService;

@WebServlet("/list")
public class CourtServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CourtDao dao = new CourtDao();
		CourtService s = new CourtService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/find.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String cust_no = request.getParameter("cust_no");
		System.out.println(cust_no);
		
		CourtDao dao = new CourtDao();
		CourtService s = new CourtService(dao);
		CourtDto dto = s.selectCourt(cust_no);
		
		if(dto.getCust_name() == null) {
			request.getRequestDispatcher("WEB-INF/views/no.jsp").forward(request, response);
		}else {
			request.setAttribute("dto", dto);
			request.getRequestDispatcher("WEB-INF/views/list.jsp").forward(request, response);
		}
	}
}
