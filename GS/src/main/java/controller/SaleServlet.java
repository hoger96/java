package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GsDao;
import model.GsService;
import model.SaleDto;

@WebServlet("/sale")
public class SaleServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GsDao dao = new GsDao();
		GsService s = new GsService(dao);
		String store_nm = request.getParameter("store_nm");
		System.out.println(store_nm);
		
		ArrayList<SaleDto> list = s.selectSale(store_nm);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/list.jsp").forward(request, response);
	}
}
