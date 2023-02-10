package edu.kh.jdbc.board.model.vo;

public class Comment {
	
	private int commentNo; // 댓글 번호
	private String commentContent;
	private int memberno;
	private String memberName;
	private String crateDate;
	private int voardNo;
	
	public Comment() {
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCrateDate() {
		return crateDate;
	}

	public void setCrateDate(String crateDate) {
		this.crateDate = crateDate;
	}

	public int getVoardNo() {
		return voardNo;
	}

	public void setVoardNo(int voardNo) {
		this.voardNo = voardNo;
	}
	
	
}
