package edu.kh.practice.model.service;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import edu.kh.practice.model.vo.Book;

public class BookService {
	
	Book service = new Book();
	
	private Scanner sc = new Scanner(System.in);
	
	public static int count = 0;
	

	List<Book> bookmember = new ArrayList<Book>();
	
	public BookService() {
		bookmember.add(new Book("용의자X의 헌신", "히가시노게이고", 15120, "재인출판사"));
		bookmember.add(new Book("자바의정석", "남궁성", 30000, "재인출판사"));
	}
	
	
	// 1) 디스플레이
	public void display() {
		
		int num = -1;
		
		do {
			
			System.out.println("===== 도서 목록 프로그램 =====");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.print("번호를 입력해 주세요 >>> ");
			
			try {

				num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				
				case 1 : System.out.println(bookAdd()); break;
				case 2 : selectBook(); break;
				case 3 : System.out.println(bookUpdate()); break;
				case 4 : bookDelete(); break;
				case 5 : favoritesAdd(); break;
				case 6 :  break;
				case 0 : System.out.println("\n프로그램을 종료 합니다.\n"); break;
				default : System.out.println("\n번호를 잘못 입력하셨습니다.\n");
				
				}
				
			} catch(InputMismatchException e) {
				
				System.out.println("\n잘못된 입력 형식 입니다. 정수를 입력해 주세요.\n");
				sc.nextLine();
				
			}
			
		} while( num != 0);
		
	}
	
	// 2) 도서 등록
	public String bookAdd() {
		

		int num = -1;

		while(num != 9) {
			
			try {
				
				System.out.println("===== 도서 등록 =====");
				
				System.out.println("1. 도서 등록");
				System.out.println("9. 이전 메뉴로");
				System.out.print("번호를 입력해주세요 >>> ");
				num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : 
						
					System.out.print("책 이름 : ");
					String name = sc.nextLine();
					
					System.out.print("작가 이름 : ");
					String author = sc.nextLine();
					
					System.out.print("도서 가격 : ");
					int price = sc.nextInt();
					sc.nextLine();
					
					System.out.print("출판사 : ");
					String publisher = sc.nextLine();
					
					bookmember.add(new Book(name, author, price, publisher));
					return "\n등록에 성공하였습니다.\n";

				case 9 : return "\n이전 메뉴로 돌아갑니다.\n";
				
				default : System.out.println("\n번호를 잘못 입력하셨습니다.\n");
				
				}
				
			} catch(InputMismatchException e) {
				
				System.out.println("\n잘못된 입력 형식 입니다.\n");
				sc.nextLine();
				
			}
			
		}
		return "";
		
	}
	
	
	// 3) 도서 조회
	public void selectBook() {
		
		System.out.println("===== 도서 목록 =====");
		
		if(bookmember.isEmpty()) {
			System.out.println("\n등록된 도서가 없습니다.\n");
		} else {
			int index = 0;
			for(Book str : bookmember) {
				System.out.println(str);
			}
		}
		
	}
	
	
	// 4) 도서 등록 수정
	public String bookUpdate() {
		
		String result = "";
		
		int num = -1;
		
		while( num != 9) {

			try {
				System.out.println("===== 도서 수정 =====");
				System.out.println("1. 도서 수정");
				System.out.println("9. 이전 메뉴로");
				System.out.print("번호를 입력해주세요 >>> ");
				num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : 
					
					int i = 0;
					
					selectBook();
					System.out.print("수정하실 책의 이름을 입력해주세요 >>> ");
					String input = sc.nextLine();
					
					for(Book book : bookmember) {
						
						if(book.getName().equals(input)) {
							
							System.out.print("책 이름 : ");
							String name = sc.nextLine();
							
							System.out.print("작가 이름 : ");
							String author = sc.nextLine();
							
							System.out.print("도서 가격 : ");
							int price = sc.nextInt();
							sc.nextLine();
							
							System.out.print("출판사 : ");
							String publisher = sc.nextLine();
							
							Book temp = bookmember.set(i, new Book(name, author, price, publisher));
							return temp.getName() + "의 수정이 성공하였습니다.";
						} 
						
						i++;
					}
					
					System.out.println("일치하는 책이 없습니다.");
		
					
				case 9 : result = "\n이전메뉴로 돌아갑니다\n"; break;
				
				default : System.out.println("\n번호를 잘못 입력하셨습니다.\n");
				
				}
				
			} catch(InputMismatchException e) {
				
				System.out.println("\n잘못된 입력 형식 입니다.\n");
				sc.nextLine();
				
			}
				
		}
		
		return result;
	}
	
	
	// 5) 도서 삭제
	public void bookDelete() {
		
		int input = -1;
		
		while(input != 9) {
			
			System.out.println("===== 도서 삭제 =====");
			System.out.println("1.도서 삭제");
			System.out.println("9.이전메뉴로");
			
			try {
				System.out.print("번호를 입력해주세요 >>> ");
				input = sc.nextInt();
				sc.nextLine();
				
				boolean flag = true;
				
				if(input == 1) {
					
					selectBook();
					System.out.print("삭제하실 책의 이름을 입력해주세요 >>> ");
					String str = sc.nextLine();
					
					int i = 0;
					for(Book book : bookmember) {
						
						if(book.getName().equals(str)) {
							
							flag = false;
							
							System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
							char ch = sc.next().toUpperCase().charAt(0);
							
							if(ch == 'Y') {
								Book temp = bookmember.remove(i);
								System.out.println(temp.getName() + "의 정보가 삭제되었습니다.");
								break;
								
							} else {
								System.out.println("이전메뉴로 돌아갑니다.");
								break;
							}
						}
						
						i++;
					}
					
					if(flag) {
						System.out.println("일치하는 책이 없습니다.");
					}
					
				} else if (input == 9) {
					
					System.out.println("이전메뉴로 돌아갑니다.");
					
				} else {
					
					System.out.println("번호를 잘못 입력하셨습니다.");
					
				}
				
			} catch(InputMismatchException e) {
				
				System.out.println("입력형식이 유효하지 않습니다.");
				sc.nextLine();
				
			}
			
		}
		
	}
	
	// 6) 즐겨찾기 추가
	public void favoritesAdd() {
		
		selectBook();
		System.out.print("\n추가하실 책의 이름을 입력하세요 >>> ");
		String input = sc.nextLine();
		
		String str1 = "";
		String str2 = "";
		
		int i = 0;
		for(Book book : bookmember) {
			if(book.getName().equals(input)) {
			
				int num = i;
				break;
				
			}
			
			i++;
		}
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("favorites.txt", true);
			
			
			boolean flag = true;
			
			String result = "";
			
			for(Book book : bookmember) {
				if(book.getName().equals(input)) {
					flag = false;
					result += book.getBookNumber() + "   "  + book.getName() + "   " + book.getAuthor() + "\n";
					fw.write(result);
					break;
				}
			}
			
			if(flag) {
				System.out.println("일치하는 책이 없습니다.");
			}
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	private FileReader FileReader(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	// 7) 즐겨찾기 삭제
//	public void favoritesDelte() {
//		
//		FileReader fr = null;
//		
//		try {
//			
//			fr = new FileReader("favorites.txt");
//			
//		} catch(IOException e) {
//			
//			e.printStackTrace();
//			
//		} finally {
//			fr.close();
//		}
//	}
	
	
	
	
	
	
}
