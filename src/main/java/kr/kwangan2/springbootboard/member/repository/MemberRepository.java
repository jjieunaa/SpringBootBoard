package kr.kwangan2.springbootboard.member.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.springbootboard.member.entity.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
