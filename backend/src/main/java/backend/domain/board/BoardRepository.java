package backend.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.domain.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
}