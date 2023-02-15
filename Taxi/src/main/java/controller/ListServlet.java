package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListDto;
import model.TaxiDao;
import model.TaxiService;

@WebServlet("/list")
public class ListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TaxiDao dao = new TaxiDao();
		TaxiService s = new TaxiService(dao);
		ArrayList<ListDto> list = s.selectList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/list.jsp").forward(request, response);
	}
}
