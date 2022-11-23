package kr.kwangan2.springbootboard.member.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kwangan2.springbootboard.member.repository.MemberRepository;

import kr.kwangan2.springbootboard.member.entity.Member;
import kr.kwangan2.springbootboard.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepo;
	
	@Override
	public Member getMember(Member member) {
		Optional<Member> findMember = memberRepo.findById(member.getId());
		
		if (findMember.isPresent()) {
			return findMember.get();
		} else {
			return null;
		}
	}

}
