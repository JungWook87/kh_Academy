package edu.kh.comm.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.comm.board.model.dao.ReplyDAO;
import edu.kh.comm.board.model.vo.Reply;
import edu.kh.comm.common.Util;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyDAO dao;

	
	// 댓글 목록 조회
	@Override
	public List<Reply> replyList(int boardNo) {
		
		return dao.replyList(boardNo);
	}


	// 댓글 삽입
	@Override
	public int replyInsert(Reply inputReply) {
		
		inputReply.setReplyContent(Util.XSSHandling(inputReply.getReplyContent()));
		inputReply.setReplyContent(Util.newLineHandling(inputReply.getReplyContent()));
		
		return dao.replyInsert(inputReply);
	}


	// 댓글 수정
	@Override
	public int replyUpdate(Reply updateReply) {
		
		updateReply.setReplyContent(Util.XSSHandling(updateReply.getReplyContent()));
		updateReply.setReplyContent(Util.newLineHandling(updateReply.getReplyContent()));
		
		return dao.replyUpdate(updateReply);
	}

	
	// 댓글 삭제
	@Override
	public int replyDelete(int replyNo) {
		return dao.replyDelete(replyNo);
	}
	
	
	
	
	
	
	
}
