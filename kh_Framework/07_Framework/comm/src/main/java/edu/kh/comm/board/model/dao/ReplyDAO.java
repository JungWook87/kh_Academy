package edu.kh.comm.board.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.comm.board.model.vo.Reply;

@Repository
public class ReplyDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	/** 댓글 목록 조회
	 * @param boardNo
	 * @return rList
	 */
	public List<Reply> replyList(int boardNo) {
		return sqlSession.selectList("replyMapper.replyList", boardNo);
	}

	
	/** 댓글 삽입
	 * @param inputReply
	 * @return result
	 */
	public int replyInsert(Reply inputReply) {
		return sqlSession.insert("replyMapper.replyInsert", inputReply);
	}

	
	/** 댓글 수정
	 * @param updateReply
	 * @return result
	 */
	public int replyUpdate(Reply updateReply) {
		return sqlSession.update("replyMapper.replyUpdate", updateReply);
	}


	/** 댓글 삭제
	 * @param replyNo
	 * @return result
	 */
	public int replyDelete(int replyNo) {
		return sqlSession.update("replyMapper.replyDelete", replyNo);
	}

}
