package backend.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import backend.domain.board.BoardRepository;
import backend.domain.board.dto.BoardDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardService {

	private final BoardRepository boardRepository;


	public Page<BoardDto> searchBoards() {
		return boardRepository.searchBoards();
	}

}
