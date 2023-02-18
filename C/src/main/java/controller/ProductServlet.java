package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CDao;
import model.CService;
import model.ProductDto;

@WebServlet("/productlist")
public class ProductServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CDao dao = new CDao();
		CService s = new CService(dao);
		ArrayList<ProductDto> list = s.selectProduct();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/productlist.jsp").forward(request, response);
	}
}
