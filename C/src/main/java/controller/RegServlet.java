package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CDao;
import model.CService;
import model.RegDto;
import model.SeqDto;

@WebServlet("/reg")
public class RegServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CDao dao = new CDao();
		CService s = new CService(dao);
		SeqDto dto = s.selectSeq();
		
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String saleno = request.getParameter("saleno");
		String pcode = request.getParameter("pcode");
		String saledate = request.getParameter("saledate");
		String scode = request.getParameter("scode");
		String amount = request.getParameter("amount");
		
		System.out.println(saleno);
		System.out.println(pcode);
		System.out.println(saledate);
		System.out.println(scode);
		System.out.println(amount);
		
		CDao dao = new CDao();
		CService s = new CService(dao);
		RegDto dto = new RegDto(saleno, pcode, saledate, scode, amount);
		s.insert(dto);
		
		response.sendRedirect("index.jsp");
		
	}
}
