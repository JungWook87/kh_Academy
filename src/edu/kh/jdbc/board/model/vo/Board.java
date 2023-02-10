package edu.kh.jdbc.board.model.vo;

import java.util.List;

public class Board {
	
	private int boardNo; // 게시글 번호
	private String boardTitle; // 게시글 제목
	private String boardContent;// 게시글 내용
	private String createDate; // 작성일
	private int readCount; // 조회수
	private int memberNo; // 작성자 회원 번호
	private String memberName; // 작성자 회원 이름
	private int commentCount; // 댓글 수
	
	private List<Comment> commetnList;// 댓글 목록
	
	public Board() {}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public List<Comment> getCommetnList() {
		return commetnList;
	}

	public void setCommetnList(List<Comment> commetnList) {
		this.commetnList = commetnList;
	}


public void temp() {
		/*
		private int boardNo;
		private String boardTitle;
		private String boardContent;
		private String createDt;
		private String readCount;
		private String deleteFl;
		private String memberNo;
		private String memberName;
		private String answer;
		
		
		public Board() {}

		public Board(int boardNo, String boardTitle, String boardContent, String memberName , String createDt, String readCount,
				String answer) {
			super();
			this.boardNo = boardNo;
			this.boardTitle = boardTitle;
			this.boardContent = boardContent;
			this.memberName = memberName;
			this.createDt = createDt;
			this.readCount = readCount;
			this.answer = answer;
			
		}
		
		public Board(int boardNo, String boardTitle, String memberName, String createDt, String readCount) {
			this.boardNo = boardNo;
			this.boardTitle = boardTitle;
			this.memberName = memberName;
			this.createDt = createDt;
			this.readCount = readCount;		
		}
		


		public int getBoardNo() {
			return boardNo;
		}

		public void setBoardNo(int boardNo) {
			this.boardNo = boardNo;
		}

		public String getBoardTitle() {
			return boardTitle;
		}

		public void setBoardTitle(String boardTitle) {
			this.boardTitle = boardTitle;
		}

		public String getBoardContent() {
			return boardContent;
		}

		public void setBoardContent(String boardContent) {
			this.boardContent = boardContent;
		}

		public String getCreateDt() {
			return createDt;
		}

		public void setCreateDt(String createDt) {
			this.createDt = createDt;
		}

		public String getReadCount() {
			return readCount;
		}

		public void setReadCount(String readCount) {
			this.readCount = readCount;
		}

		public String getDeleteFl() {
			return deleteFl;
		}

		public void setDeleteFl(String deleteFl) {
			this.deleteFl = deleteFl;
		}

		public String getMemberNo() {
			return memberNo;
		}

		public void setMemberNo(String memberNo) {
			this.memberNo = memberNo;
		}

		@Override
		public String toString() {
			return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle +", "
					+ "memberName=" + memberName + ", createDt=" + createDt + ", readCount="
					+ readCount + "]";
		}
		*/
	}
	
}
