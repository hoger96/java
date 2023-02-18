package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CDao;
import model.CService;
import model.SaleDto;

@WebServlet("/info")
public class InfoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CDao dao = new CDao();
		CService s = new CService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/find.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String saleno = request.getParameter("saleno");
		System.out.println(saleno);
		
		CDao dao = new CDao();
		CService s = new CService(dao);
		SaleDto dto = s.selectOne(saleno);
		
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("WEB-INF/views/info.jsp").forward(request, response);
	}
}
