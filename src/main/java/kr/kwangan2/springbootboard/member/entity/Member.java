package kr.kwangan2.springbootboard.member.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Member {
	
	public Member() {
		
	}
	
	@Id
	private String id;
	private String password;
	private String name;
	private String role;

}
