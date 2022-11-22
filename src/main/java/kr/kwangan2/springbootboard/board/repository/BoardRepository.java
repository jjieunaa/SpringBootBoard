package kr.kwangan2.springbootboard.board.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.springbootboard.board.entity.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
