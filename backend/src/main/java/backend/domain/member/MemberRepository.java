package backend.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.domain.board.BoardRepositoryCustom;
import backend.domain.board.entity.Board;
import backend.domain.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
}