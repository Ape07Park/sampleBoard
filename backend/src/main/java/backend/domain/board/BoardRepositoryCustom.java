package backend.domain.board;

import org.springframework.data.domain.Page;

import backend.domain.board.dto.BoardDto;

public interface BoardRepositoryCustom {

	Page<BoardDto> searchBoards();
}
