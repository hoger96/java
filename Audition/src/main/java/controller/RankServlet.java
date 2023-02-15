package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AuditionDao;
import model.AuditionService;
import model.RankListDto;

@WebServlet("/rank.go")
public class RankServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AuditionDao dao = new AuditionDao();
		AuditionService s = new AuditionService(dao);
		ArrayList<RankListDto> list = s.selectRankList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/ranklist.jsp").forward(request, response);
	}
}
