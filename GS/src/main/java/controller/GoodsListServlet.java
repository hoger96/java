package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GoodsDto;
import model.GsDao;
import model.GsService;

@WebServlet("/productlist")
public class GoodsListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GsDao dao = new GsDao();
		GsService s = new GsService(dao);
		ArrayList<GoodsDto> list = s.selectGoods();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/productlist.jsp").forward(request, response);
	}
}
