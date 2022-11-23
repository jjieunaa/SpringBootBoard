package kr.kwangan2.springbootboard.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.springbootboard.board.entity.Board;
import kr.kwangan2.springbootboard.board.repository.BoardRepository;
import kr.kwangan2.springbootboard.member.entity.Member;
import kr.kwangan2.springbootboard.member.repository.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataInitializeTest {
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	public void testDataInsert() {
		Member member1 = new Member("member1", "member111", "둘리", "ROLE_USER");
		memberRepo.save(member1);
		
		Member member2 = new Member("member2", "member222", "도우너", "ROLE_ADMIN");
		memberRepo.save(member2);
		
		for (int i=1; i<=6; i++) {
			boardRepo.save(new Board("제목", i%2==1 ? "둘리" : "도우너", "내용"));
		}
		
	}

}
