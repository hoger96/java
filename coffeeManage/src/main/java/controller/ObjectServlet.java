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
import model.ObjectDto;

@WebServlet("/objectlist")
public class ObjectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CoffeeDao dao = new CoffeeDao();
		CoffeeService s = new CoffeeService(dao);
		
		ArrayList<ObjectDto> list = s.selectObjectlist();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/objectlist.jsp").forward(request, response);
	}
}
