package edu.kh.comm.board.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.comm.board.model.vo.BoardDetail;
import edu.kh.comm.board.model.vo.BoardType;

public interface BoardService {

	/** 게시판 코드, 이름 조회
	 * @return boardTypeList
	 */
	List<BoardType> selectBoardType();

	/** 게시글 목록 조회 서비스
	 * @param cp
	 * @param boardCode
	 * @return
	 */
	Map<String, Object> selectBoardList(int cp, int boardCode);

	/** 게시글 상세 조회 서비스
	 * @param boardNo
	 * @return
	 */
	BoardDetail selectBoardDetail(int boardNo);

	
	/** 게시글 조회수 증가
	 * @param detail
	 * @return result
	 */
	int updateReadCount(int boardNo);

	Map<String, Object> searchBoardList(Map<String, Object> paramMap);

}
