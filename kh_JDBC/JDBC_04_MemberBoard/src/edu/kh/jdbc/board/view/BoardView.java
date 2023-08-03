package edu.kh.jdbc.board.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.jdbc.board.model.vo.Board;
import edu.kh.jdbc.board.service.BoardService;
import static edu.kh.jdbc.main.view.MainView.*;
import edu.kh.jdbc.member.vo.Member;

public class BoardView {
	
	private Scanner sc = new Scanner(System.in);
	private BoardService bservice = new BoardService();

	public void boardMenu() {
		
		int input = -1;
		
		do {
			
			try {
			
				System.out.println("===== 게시판 기능 =====");
				
				System.out.println("1. 게시글 목록 조회");
				System.out.println("2. 게시글 상세 조회(+ 댓글 기능)");
				System.out.println("3. 게시글 작성");
				System.out.println("4. 게시글 검색");
				System.out.println("0. 이전 메뉴로");
				
				System.out.print("\n메뉴 선택 : ");
				input = sc.nextInt();
				sc.nextLine();
				
				System.out.println();
				
				switch(input) {
				case 1 :  selectAllBoard(); break;
//				case 2 : selectBoard(); break;
				case 3 : insertBoard(); break;
//				case 4 : searchBoard(); break;
				case 0 : System.out.println("이전 메뉴로 돌아갑니다."); break;
				default : System.out.println("메뉴에 있는 번호만 입력해주세요");
				}
				
				System.out.println();
				
			} catch(InputMismatchException e) {
				System.out.println("입력 형식이 올바르지 않습니다.");
				e.printStackTrace();
			}
			
		} while(input != 0);
		
		/*게시판 기능 (Board View, Service, DAO, board-query.xml)
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
		 * 
		 */
		
		
	}



	/** 게시글 목록 조회
	 * @param loginMember
	 */
	private void selectAllBoard() {
		System.out.println("===== 게시글 목록 조회 =====");
		
		try {
			
			List<Board> boardList = bservice.selectAllBoard();
			
			if(boardList.isEmpty()) {
				System.out.println("조회된 결과가 없습니다");
			} else {
				for(Board b : boardList) {
					System.out.printf("%d | %s[%d] | %s | %s | %d\n",
							b.getBoardNo(), 
							b.getBoardTitle(), 
							b.getCommentCount(),
							b.getMemberName(),
							b.getCreateDate(),
							b.getReadCount());

				}
			}
			
			
		} catch(Exception e) {
			System.out.println("게시글 목록 조회 중 예외 발생");
			e.printStackTrace();
		}
		
	}


	/** 게시글 상세 조회
	 * @param loginMember
	 */
	private void selectBoard() {
		/*2. 게시글 상세 조회(게시글 번호 입력 받음) // select where no = inputno =>
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
		 *     */
		
		System.out.println("===== 게시글 상세 조회 =====");
				
		System.out.print("게시글 번호 입력 : ");
		System.out.print("번호 입력 : ");
		int inputNumber = sc.nextInt();
		sc.nextLine();
		
		
		
		
		System.out.println("1. 댓글 작성");
		System.out.println("2. 댓글 수정");
		System.out.println("3. 댓글 삭제");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 이전 목록으로");
		
		System.out.print("번호 입력 : ");
		inputNumber = sc.nextInt();
		sc.nextLine(); 
		
		switch(inputNumber) {
		case 1 :  break;
		case 2 :  break;
		case 3 :  break;
		case 4 :  break;
		case 5 :  break;
		case 0 : System.out.println("이전 메뉴로");  break;
		default : System.out.println("메뉴에 있는 번호만 눌러주세요");
		}
		
		
	}


	/** 게시글 등록(삽입)
	 * 
	 */
	private void insertBoard() {
		System.out.println("\n[게시글 등록]\n");
		
		System.out.print("제목 : ");
		String boardTitle = sc.nextLine();
		
		System.out.print("내용 : ");
		String boardcContent = inputContent();
		
		// Board 객체에 제목, 내용, 회원 번호를 담아서 서비스에 전달
		Board board = new Board();
		board.setBoardTitle(boardTitle);
		board.setBoardContent(boardcContent);
		board.setMemberNo(LoginMember.getMemberNo());
		
		int result = bservice.insertBoard(board);
		
	}



	/** 내용 입력 매서드
	 * @return
	 */
	private String inputContent() {
		String content = ""; // 빈 문자열
		String input = null; //  참조하는 객체가 없음
		
		System.out.println("입력 종료 시 ($exit) 입력");
		
		while(true) {
			input = sc.nextLine();
			
			if(input.equals("$exit")) {
				break;
			}
			
			// 입력된 내용을 content에 누적
			content += input +"\n";
		}
		
		return content;
	}


}







































