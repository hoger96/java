package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LectureDao;
import model.LectureService;
import model.ListDto;

@WebServlet("/list")
public class listServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LectureDao dao = new LectureDao();
		LectureService s = new LectureService(dao);
		ArrayList<ListDto> list = s.selectList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/list.jsp").forward(request, response);
	}
}
