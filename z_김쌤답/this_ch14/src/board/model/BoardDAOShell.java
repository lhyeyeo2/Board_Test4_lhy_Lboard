package board.model;

import java.sql.*;
import java.util.ArrayList;
import javax.naming.*;
import javax.sql.DataSource;

public class BoardDAOShell {
	
	DataSource ds;
	public static final int WRITING_PER_PAGE = 10;
	
	public BoardDAOShell(){
		try{
			Context initContext = (Context)new InitialContext().lookup("java:comp/env/");
			ds = (DataSource)initContext.lookup("jdbc/mysql");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// 게시판 목록 조회 기능 수행
	public ArrayList<BoardDTO> boardList(String curPage){
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		return list;
	}
	
	// 게시판의 페이징 처리를 위한 기능 수행
	public int boardPageCnt(){
		int pageCnt = 0;
		return pageCnt;
	}
	
	// 게시글 등록 기능 수행
	public void boardWrite(String name, String subject, String content, String password){
	}
	
	// 게시글 열람 기능 수행
	public BoardDTO boardRead(String inputNum){
		BoardDTO writing = new BoardDTO();
		return writing;
	}
	
	// 게시글 수정 기능 수행
	public void boardUpdate(String inputNum, String inputSubject, String inputContent, String inputName, String inputPassword){
	}
	
	// 게시글 수정 및 삭제를 위한 비밀번호 확인 기능 조회
	public boolean boardPasswordCheck(String inputNum, String inputPassword){
		boolean passwordOk = false;
		return passwordOk;
	}
	
	// 글 수정 화면에 필요한 원글 데이터 조회 기능
	public BoardDTO boardUpdateForm(String inputNum){
		BoardDTO writing = new BoardDTO();
		return writing;
	}
	
	// 게시글 삭제 기능 수행
	public void boardDelete(String inputNum){
	}
	
	// 삭제 대상인 게시글에 답글의 존재 유무를 검사
	public boolean boardReplyCheck(String inputNum){
		boolean replyCheck = false;
		return replyCheck;
	}
	
	// 게시글이 답글일 경우, 원글들의 답글 개수를 줄여주는 기능 수행
	public void boardDeleteChildCntUpdate(int ref, int lev, int step){
	}
	
	// 검색 기능 수행
	public ArrayList<BoardDTO> boardSearch(String searchOption, String searchWord){
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		return list;
	}
	
	// 답글 작성에 필요한 원글 데이터 조회 기능
	public BoardDTO boardReplyForm(String inputNum){
		BoardDTO writing = new BoardDTO();
		return writing;
	}
	
	// 답글 등록 기능 수행
	public void boardReply(String num, String name, String subject, String content, String password, String ref, String step, String lev){
	}
	
	// 답글의 출력 위치 (step) 선정 기능 수행
	public int boardReplySearchStep(String ref, String lev, String step){
		int replyStep=0;
		return replyStep;
	}
	
	// 답글 작성 후, 원글들의 답글 개수를 늘려주는 기능 수행
	public void boardReplyChildCntUpdate(String ref, String lev, int replyStep){
	}
}
