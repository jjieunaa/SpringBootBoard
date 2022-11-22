package kr.kwangan2.springbootboard.board.service;

import java.util.List;

import kr.kwangan2.springbootboard.board.entity.Board;

public interface BoardService {
	
	public List<Board> listBoard(Board board);
	
	public Board getBoard(Board board, String action);
	
	public void insertBoard(Board board);
	
	public void updateBoard(Board board);
	
	public void deleteBoard(Board board);

}
