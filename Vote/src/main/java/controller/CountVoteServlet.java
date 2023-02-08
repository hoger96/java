package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CountVoteDto;
import model.VoteDao;
import model.VoteService;

@WebServlet("/voterank")
public class CountVoteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		VoteDao dao = new VoteDao();
		VoteService s = new VoteService(dao);
		ArrayList<CountVoteDto> list = s.selectVoteList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/voterank.jsp").forward(request, response);
	}
	
			
}
