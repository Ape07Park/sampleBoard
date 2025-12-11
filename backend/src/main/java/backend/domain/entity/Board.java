package backend.domain.entity;

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
import lombok.Data;
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
	@Column(name = "board_id" )
	private Long id;

	@Column( name = "title")
	private String title;

	@Lob
	@Column( columnDefinition = "LONGTEXT")
	private String content;
}
