package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDao;
import model.StudentDto;
import model.StudentService;

@WebServlet("/studentlist")
public class StudentListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDao dao = new StudentDao();
		StudentService s = new StudentService(dao);
		ArrayList<StudentDto> list = s.selectStudent();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/studentlist.jsp").forward(request, response);
	}
}
