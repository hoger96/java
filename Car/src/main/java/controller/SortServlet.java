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
import model.SortDto;

@WebServlet("/sortsale")
public class SortServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarDao dao = new CarDao();
		CarService s = new CarService(dao);
		ArrayList<SortDto> list = s.selectSort();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/sortlist.jsp").forward(request, response);
	}
}
