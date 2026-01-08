package backend.domain.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {

	private Long id;

	private String title;

	private String writerName;

	private String content;

	private Integer readCount;
}
