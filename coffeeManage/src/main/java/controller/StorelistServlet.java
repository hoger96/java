package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CoffeeDao;
import model.CoffeeService;
import model.StoreDto;

@WebServlet("/storelist")
public class StorelistServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CoffeeDao dao = new CoffeeDao();
		CoffeeService s = new CoffeeService(dao);
		ArrayList<StoreDto> list = s.selectStorelist();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/storelist.jsp").forward(request, response);
	}
}
