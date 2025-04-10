package com.thejoa.boot005.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository<Member , Long>{
	Optional<Member>	findByUsername(String username);
	
	@Modifying    
	@Transactional 
	@Query("update Member m set m.password=:password where m.password = :old and m.id=:id")
	int updateByIdAndPassword(String password, String old , Long id );
	
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query("insert into member m(username, password, email) values(:username, :password, :email)"
	 * ) int insertByIdAndPasswordAndEmail(String id , String password , String
	 * email );
	 */
}
// Q1. crud - sql구문적기
// insert into member (username , password , email) values (?,?,?) - save
// select * from member              - findAll
// select * from member where id=?   - findById
// update member set email=? , username=? , password=? where id=?  - save
// delete from member where id=?

// Q2. @Query 아이디와 비번이 같은 유저의 비밀번호 변경 - 위에 repository 작성!
// 2-1 @Modifying @Transactional @Query