package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AreaDto;
import model.ResDao;
import model.ResService;

@WebServlet("/area")
public class RegionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ResDao dao = new ResDao();
		ResService s = new ResService(dao);
		ArrayList<AreaDto> list = s.selectArea();
		
		request.setAttribute("list",list);
		request.getRequestDispatcher("WEB-INF/views/arealist.jsp").forward(request, response);
	}
}
