package edu.kh.comm.main.controller;

import java.sql.SQLException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(SQLException.class)
	public String SQLException(Exception e, Model model) {
		e.printStackTrace();
		
		model.addAttribute("errorMessage", "SQL 처리에서 예외 발생");
		model.addAttribute("e", e);
		
		return "common/error";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String RuntimeException(Exception e, Model model) {
		e.printStackTrace();
		
		model.addAttribute("errorMessage", "실행 중 예외 발생");
		model.addAttribute("e", e);
		
		return "common/error";
	}
	
	// 예외 처리 상황을 예외별로 세분화하여 담아준다
	
}
