package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarDao;
import model.CarService;
import model.SaleonDto;

@WebServlet("/saleon")
public class SaleonServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarDao dao = new CarDao();
		CarService s = new CarService(dao);
		ArrayList<SaleonDto> list = s.selectSaleon();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/saleon.jsp").forward(request, response);
		
	}
}
