package kr.kwangan2.springbootboard.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.kwangan2.springbootboard.board.entity.Board;
import kr.kwangan2.springbootboard.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board/listBoard")
	public String listBoard(Model model, Board board) {
		
		List<Board> boardList = boardService.listBoard(board);
		model.addAttribute("boardList", boardList);
		
		return "/board/listBoard";
	
	}
	
	@GetMapping("/board/insertBoard")
	public String insertBoard() {
		return "/board/insertBoard";
	}
	
	@PostMapping("/board/insertBoardProc")
	public String insertBoardProc(Board board) {
		boardService.insertBoard(board);
		
		return "redirect:/board/listBoard";
	}
	
	@GetMapping("/board/getBoard")
	public String getBoard(Board board, Model model, String action) {
		model.addAttribute("board", boardService.getBoard(board, action));
		
		return "/board/getBoard";
	}
	
	@PostMapping("/board/updateBoardProc")
	public String updateBoardProc(Board board) {
		boardService.updateBoard(board);
		
		return "redirect:/board/listBoard";
	}
	
	@GetMapping("/board/deleteBoard")
	public String deleteBoard(Board board) {
		boardService.deleteBoard(board);
		
		return "redirect:/board/listBoard";
	}
	
}	// class
