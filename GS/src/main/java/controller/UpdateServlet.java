package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GoodsDto;
import model.GsDao;
import model.GsService;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String goods_cd = request.getParameter("goods_cd");
		System.out.println(goods_cd);
		
		GsDao dao = new GsDao();
		GsService s = new GsService(dao);
		GoodsDto dto = s.selectGoodscd(goods_cd);
		
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("WEB-INF/views/update.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String goods_cd = request.getParameter("goods_cd");
		String goods_nm = request.getParameter("goods_nm");
		String price = request.getParameter("price");
		String cose = request.getParameter("cose");
		String in_date = request.getParameter("in_date");
		
		System.out.println(goods_cd);
		System.out.println(goods_nm);
		System.out.println(price);
		System.out.println(cose);
		System.out.println(in_date);
		
		GsDao dao = new GsDao();
		GsService s = new GsService(dao);
		GoodsDto dto = new GoodsDto(goods_cd, goods_nm, price, cose, in_date);
		s.update(dto);
		
		response.sendRedirect("index.jsp");
	
	}
}
