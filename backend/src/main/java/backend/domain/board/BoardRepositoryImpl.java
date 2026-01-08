package backend.domain.board;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import backend.domain.board.dto.BoardDto;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryCustom {

	JPAQueryFactory queryFactory;

	@Override
	public Page<BoardDto> searchBoards() {
		return null;
	}
}
