package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CourtDao;
import model.CourtService;
import model.UserDto;

@WebServlet("/user")
public class UserServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CourtDao dao = new CourtDao();
		CourtService s= new CourtService(dao);
		ArrayList<UserDto> list = s.selectUser();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/user.jsp").forward(request, response);
	}
}
