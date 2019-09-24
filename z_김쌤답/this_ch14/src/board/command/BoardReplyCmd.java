package board.command;

import javax.servlet.http.*;
import board.model.*;


public class BoardReplyCmd implements BoardCmd{

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		String ref = request.getParameter("ref");
		String lev = request.getParameter("lev");
		String step = request.getParameter("step");
		
		BoardDAO dao = new BoardDAO();
		dao.boardReply(num, name, subject, content, password, ref, step, lev);
	}
}
