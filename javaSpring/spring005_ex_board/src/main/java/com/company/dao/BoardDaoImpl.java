package com.company.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.dto.BoardDto;

public interface BoardDaoImpl extends BoardDao {
	@Autowired SqlSession sqlSession;
	private static final String namespace="com.company.dao.BoardDao";
	
	@Override public int insert(BoardDto dto); {return sqlSession.insert(namespace + "insert", dto);}
	@Override public int update(BoardDto dto); {return sqlSession.insert(namespace + "insert", dto);}
	@Override public int delete(BoardDto dto); {return sqlSession.insert(namespace + "insert", dto);}
	@Override public int update(int bno); {return sqlSession.insert(namespace + "insert", dto);}
	@Override public BoardDto select(int bno); {return sqlSession.insert(namespace + "insert", dto);}
	@Override public List<BoardDto> selectAll(); {return sqlSession.insert(namespace + "insert", dto);}
}
