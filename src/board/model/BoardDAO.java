package board.model;

	import java.sql.*;
	import java.util.ArrayList;
	import javax.naming.*;
	import javax.sql.DataSource;


public class BoardDAO {

		DataSource ds;
		public static final int WRITING_PER_PAGE = 10;
		
		public BoardDAO() {
			try {
				Context initContext = (Context)new InitialContext().lookup
				ds = (DataSource)initContext.lookup("jdbc/oracle");				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//게시판 목록 조회 기능 수행
	public ArrayList <BoardDTO> boardList (String curPage) {
		
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		conn = ds.getConnection();
		String sql = "SELECT * FROM "
				+ " SELECT ROWNUM num,name, password, subject, content, write_date, "
				+ " write_time, ref, step, lev, read_cnt, child_cnt ";
				+ " FROM BOARD ORDER BY ref DESC, STEP asc";
				
		}
	}
}
