package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarDao;
import model.CarService;
import model.NewRegDto;

@WebServlet("/newreg")
public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarDao dao = new CarDao();
		CarService s = new CarService(dao);
		
		request.getRequestDispatcher("WEB-INF/views/newreg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String c_code = request.getParameter("c_code");
		String c_class = request.getParameter("c_class");
		String c_name = request.getParameter("c_name");
		String c_age = request.getParameter("c_age");
		String c_kilo = request.getParameter("c_kilo");
		String c_price = request.getParameter("c_price");
		
		CarDao dao = new CarDao();
		CarService s = new CarService(dao);
		NewRegDto dto = new NewRegDto(c_code, c_class, c_name, c_age, c_kilo, c_price);
		
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
	}
}
