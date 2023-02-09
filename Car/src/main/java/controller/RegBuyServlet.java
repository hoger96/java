package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BuyerDto;
import model.CarDao;
import model.CarService;

@WebServlet("/sellreg")
public class RegBuyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarDao dao = new CarDao();
		CarService s = new CarService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/sellreg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String b_id = request.getParameter("b_id");
		String b_name = request.getParameter("b_name");
		String b_code = request.getParameter("b_code");
		String b_cost = request.getParameter("b_cost");
		String b_month = request.getParameter("b_month");
		
		CarDao dao = new CarDao();
		CarService s = new CarService(dao);
		BuyerDto dto = new BuyerDto(b_id, b_name, b_code, b_cost, b_month);
		s.inserBuy(dto);
		
		response.sendRedirect("index.jsp");
	}
}
