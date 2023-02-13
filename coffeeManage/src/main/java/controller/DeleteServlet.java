package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CoffeeDao;
import model.CoffeeService;
import model.RegDto;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String saleno = request.getParameter("saleno");
		System.out.println(saleno);
		
		CoffeeDao dao = new CoffeeDao();
		CoffeeService s = new CoffeeService(dao);
		s.delete(saleno);
		
		response.sendRedirect("index.jsp");

	}
}
