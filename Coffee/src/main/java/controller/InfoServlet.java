package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CoffeeDao;
import model.CoffeeService;
import model.SalelistDto;

@WebServlet("/infolist")
public class InfoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CoffeeDao dao = new CoffeeDao();
		CoffeeService s= new CoffeeService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/info.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String saleno = request.getParameter("saleno");
		
		CoffeeDao dao = new CoffeeDao();
		CoffeeService s = new CoffeeService(dao);
		SalelistDto dto = s.selectInfo(saleno);
		
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("WEB-INF/views/infolist.jsp").forward(request, response);
	}
}
