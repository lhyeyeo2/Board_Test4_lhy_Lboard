package board;


	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	import javax.servlet.RequestDispatcher;
	import board.command.*;
	
	@WebServlet("*.bbs")
	public class BoardFrontController extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		/**
		 * @see HttpServlet#httpServlet()
		 * 
		 */
		public BoardFrontController() {
			super();
	}
		
		/**
		 * @see httpServlet#doGet (HttpServletRequest request,
		  HttpServletREspose response) 
		 * 
		 */
		protected void doGet (HttpServletRequest request,HttpServletResponse response) throws 
		ServletException, IOException { doPost(request, response);
		
		}
		
		/**
		 * @see HttpServlet#doPost(HttpServletRequset request,
		  httpServletResponse response)
		 * 
		 */
		protected void doPost (HttpServletRequest request,
				HttpServletResponse response) throws ServletException, 	IOException {
			request.setCharacterEncoding("UTF-8");
			String requestURI = request.getRequestURI();
			String contextPath = request.getContextPath();
			String cmdURI = requestURI.substring(contextPath.length());
			
			BoardCmd cmd = null;
			String viewPage = null;
			
			//
			
			RequestDispatcher dis = request.getRequestDispatcher(viewPage) ;
			dis.forward(request, response);
		}
}
