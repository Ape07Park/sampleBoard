package backend.domain.board.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
@Table( name = "board")
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "board_id")
	private Long id;

	@Column( name = "title", nullable = false)
	private String title;


	@Column(name = "writer_name", nullable = false)
	private String writerName;

	@Lob
	@Column( columnDefinition = "LONGTEXT", nullable = false)
	private String content;

	@Column(name = "read_count", nullable = false)
	@Builder.Default
	private Integer readCount = 0;

	// TODO 첨부파일 추가하기

	// TODO 감사 기능 추가하기



}
