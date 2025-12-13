package backend.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
}