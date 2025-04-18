package com.thejoa.boot003.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.thejoa.boot003.board.Board;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Column(nullable=false)
	private int age;
	
//	@Column(nullable=false)
	private String name;
	
	//private Long team_id;
	
	@Column(updatable = false)
	private LocalDateTime createDate = LocalDateTime.now();
	
	@OneToMany(mappedBy = "member")
	List<Board> board = new ArrayList<>();
	
}
