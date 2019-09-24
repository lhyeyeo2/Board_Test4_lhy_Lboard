package board.command;

import javax.servlet.http.*;

import board.model.*;

public class BoardDeleteCmd implements BoardCmd{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String inputNum = request.getParameter("num");
		
		BoardDAO dao = new BoardDAO();
		dao.boardDelete(inputNum);
	}
}
