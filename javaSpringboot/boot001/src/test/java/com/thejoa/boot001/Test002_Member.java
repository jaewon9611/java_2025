package com.thejoa.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot001.myjpa.Member;
import com.thejoa.boot001.myjpa.MemberRespository;
import com.thejoa.boot001.myjpa.Team;

@SpringBootTest
class Test002_Member {
	@Autowired MemberRespository memberRespository;
	
	@Disabled //@Test
	public void insert() {
		Team team = new Team();
		team.setId(1L);
		//team.setId(2L); // ##1 error team의 id가 2L 없어서 오류남.
		
		Member member = new Member();
		member.setName("first");
		member.setAge(11);
		member.setTeam(team); //##2
		memberRespository.save(member);  //## insert, update - save
	}
	//Q2. findAll 유저들 출력
	@Disabled //@Test
	public void selectAll() {
		List<Member> list = memberRespository.findAll();
		for(Member m: list) {System.out.println(m);}
		System.out.println(list.get(0).getName());
		
	}
	//Q3. update 이용해서 유저번호가 1L인 데이터값 수정
	@Disabled //@Test
	public void update() {
		Optional<Member>member_find = memberRespository.findById(1L);
		
		if(member_find.isPresent()); {
		
		Member member = member_find.get();
		member.setName("iron");
		member.setAge(1);
		memberRespository.save(member);
		}
	}
	//Q4. delete 이용해서 1L 유저 삭제
	@Test  
	public void delete() { 
		Optional<Member> member_find = memberRespository.findById(1L);
		if(member_find.isPresent()) {
			Member member=member_find.get();
			memberRespository.delete(member);
			
		}
	}
	
	// insert into member (name,age,create_date,team_id) value(?,?,?,?)
}
/*crud1. insert into team (name) values('milk')
crud2. select * from team / select * from team where id=? 
crud3. update team      set name=?    where id=?
crud4. delete from      team where id=?

mysql> desc team;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | bigint       | NO   | PRI | NULL    | auto_increment |
| create_date | datetime(6)  | YES  |     | NULL    |                |
| name        | varchar(255) | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)
mysql>

*/