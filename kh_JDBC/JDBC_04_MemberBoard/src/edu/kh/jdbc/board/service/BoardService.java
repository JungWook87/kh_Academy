package edu.kh.jdbc.board.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import edu.kh.jdbc.board.model.dao.BoardDAO;
import edu.kh.jdbc.board.model.vo.Board;
import edu.kh.jdbc.member.vo.Member;

public class BoardService {

	private Connection conn;
	
	BoardDAO dao = new BoardDAO();

	
	/** 게시글 목록 조회 서비스
	 * @return boardList
	 */
	public List<Board> selectAllBoard() throws Exception {
		conn = getConnection();
		
		List<Board>boardList = dao.selectAllBoard(conn);
		
		close(conn);
		
		return boardList;
	}


	public int insertBoard(Board board) {
		conn = getConnection();
		
		// 게시글 번호 생성 dao 호출
		// 왜?? 동시에 여러 사람이 게시글을 등록하면
		// 시퀀스가 한번에 증가하여 CURRVAR	구문을 이용하면 문제 발생
		// -> 게시글 등록 서비스를 호출한 순서대로
		// 미리 게시글 번호를 생성해서 얻어온 다음에 이를 이용해 INSERT 진행
		int boardNo = dao.nextBoardNo(conn);
		
		
		close(conn);
		
		return 0;
	}
	

}
