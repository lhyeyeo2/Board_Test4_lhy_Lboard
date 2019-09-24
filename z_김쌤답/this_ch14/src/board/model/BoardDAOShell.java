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
	
	// �Խ��� ��� ��ȸ ��� ����
	public ArrayList<BoardDTO> boardList(String curPage){
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		return list;
	}
	
	// �Խ����� ����¡ ó���� ���� ��� ����
	public int boardPageCnt(){
		int pageCnt = 0;
		return pageCnt;
	}
	
	// �Խñ� ��� ��� ����
	public void boardWrite(String name, String subject, String content, String password){
	}
	
	// �Խñ� ���� ��� ����
	public BoardDTO boardRead(String inputNum){
		BoardDTO writing = new BoardDTO();
		return writing;
	}
	
	// �Խñ� ���� ��� ����
	public void boardUpdate(String inputNum, String inputSubject, String inputContent, String inputName, String inputPassword){
	}
	
	// �Խñ� ���� �� ������ ���� ��й�ȣ Ȯ�� ��� ��ȸ
	public boolean boardPasswordCheck(String inputNum, String inputPassword){
		boolean passwordOk = false;
		return passwordOk;
	}
	
	// �� ���� ȭ�鿡 �ʿ��� ���� ������ ��ȸ ���
	public BoardDTO boardUpdateForm(String inputNum){
		BoardDTO writing = new BoardDTO();
		return writing;
	}
	
	// �Խñ� ���� ��� ����
	public void boardDelete(String inputNum){
	}
	
	// ���� ����� �Խñۿ� ����� ���� ������ �˻�
	public boolean boardReplyCheck(String inputNum){
		boolean replyCheck = false;
		return replyCheck;
	}
	
	// �Խñ��� ����� ���, ���۵��� ��� ������ �ٿ��ִ� ��� ����
	public void boardDeleteChildCntUpdate(int ref, int lev, int step){
	}
	
	// �˻� ��� ����
	public ArrayList<BoardDTO> boardSearch(String searchOption, String searchWord){
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		return list;
	}
	
	// ��� �ۼ��� �ʿ��� ���� ������ ��ȸ ���
	public BoardDTO boardReplyForm(String inputNum){
		BoardDTO writing = new BoardDTO();
		return writing;
	}
	
	// ��� ��� ��� ����
	public void boardReply(String num, String name, String subject, String content, String password, String ref, String step, String lev){
	}
	
	// ����� ��� ��ġ (step) ���� ��� ����
	public int boardReplySearchStep(String ref, String lev, String step){
		int replyStep=0;
		return replyStep;
	}
	
	// ��� �ۼ� ��, ���۵��� ��� ������ �÷��ִ� ��� ����
	public void boardReplyChildCntUpdate(String ref, String lev, int replyStep){
	}
}
