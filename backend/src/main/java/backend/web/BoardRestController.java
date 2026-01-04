package backend.web;

import org.springframework.web.bind.annotation.RestController;

import backend.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BoardRestController {

	private final BoardService boardService;

}
