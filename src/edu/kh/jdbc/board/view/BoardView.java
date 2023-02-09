package edu.kh.jdbc.board.view;

import java.util.Scanner;

import edu.kh.jdbc.board.service.BoardService;
import edu.kh.jdbc.member.vo.Member;

public class BoardView {
	
	private Scanner sc = new Scanner(System.in);
	private BoardService service = new BoardService();

	public void boardMenu(Member loginMember) {
		
		int input = 0;
		
		do {
			System.out.println("===== 게시판 기능 =====");
			
			System.out.println("1. 게시글 목록 조회");
			System.out.println("2. 게시글 상세 조회");
			System.out.println("3. 게시글 작성");
			System.out.println("4. 게시글 검색");
			System.out.println("0. 이전 메뉴로");
			
			System.out.print("번호 입력 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
//			case 1 :  selectAllBoard(loginMember); break;
//			case 2 : selectBoard(); break;
//			case 3 : insertBoard(); break;
//			case 4 : searchBoard(); break;
			case 0 : System.out.println("이전 메뉴로 돌아갑니다."); break;
			default : System.out.println("제시된 번호만 입력해주세요");
			}
			
		} while(input != 0);
		/*
		게시판 기능 (Board View, Service, DAO, board-query.xml)
		 * 
			 * 1. 게시글 목록 조회(작성일 내림차순) // select *
			 * 	  (게시글 번호, 제목[댓글 수], 작성자명, 작성일, 조회수 )
		 * 
		 * 2. 게시글 상세 조회(게시글 번호 입력 받음) // select where no = inputno =>
		 *    (게시글 번호, 제목, 내용, 작성자명, 작성일, 조회수, 
		 *     댓글 목록(작성일 오름차순 )
		 *     
		 *     2-1. 댓글 작성
		 *     2-2. 댓글 수정 (자신의 댓글만)
		 *     2-3. 댓글 삭제 (자신의 댓글만)
		 * 
		 *     // 자신이 작성한 글 일때만 메뉴 노출
		 *     2-4. 게시글 수정
		 *     2-5. 게시글 삭제
		 *     
		 *     
		 * 3. 게시글 작성(제목, 내용 INSERT) 
		 * 	-> 작성 성공 시 상세 조회 수행
		 * 
		 * 4. 게시글 검색(제목, 내용, 제목+내용, 작성자)
		 */
		
		
		
	}


}
