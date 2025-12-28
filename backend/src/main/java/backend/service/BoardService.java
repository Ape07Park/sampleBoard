package backend.service;

import org.springframework.stereotype.Service;

import backend.domain.board.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardService {

	private final BoardRepository boardRepository;

}
