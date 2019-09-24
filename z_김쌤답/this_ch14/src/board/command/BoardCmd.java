package board.command;

import javax.servlet.http.*;

public interface BoardCmd {
	
	public void execute(HttpServletRequest request, HttpServletResponse response);

}
