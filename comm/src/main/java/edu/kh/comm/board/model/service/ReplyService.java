package edu.kh.comm.board.model.service;

import java.util.List;

import edu.kh.comm.board.model.vo.Reply;

public interface ReplyService {

	/** 댓글 목록 조회
	 * @return rList
	 */
	List<Reply> replyList(int boardNo);

	/** 댓글 삽입
	 * @param inputReply
	 * @return result
	 */
	int replyInsert(Reply inputReply);

	/** 댓글 수정
	 * @param updateReply
	 * @return result
	 */
	int replyUpdate(Reply updateReply);

	/** 댓글 삭제
	 * @param replyNo
	 * @return result
	 */
	int replyDelete(int replyNo);

}
