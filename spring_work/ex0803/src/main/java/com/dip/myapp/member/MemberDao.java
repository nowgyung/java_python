package com.dip.myapp.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(MemberDto memberDto) {
//		jdbcTemplate.update(new PreparedStatementCreator() {
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				return null;
//			}
//		});
		jdbcTemplate.update((con)->{
			PreparedStatement pstmt = 
					con.prepareStatement("insert into member"
							+ " (EMAIL, PASSWORD, NAME, REGDATE) "
							+ " values(?,?,?,?)");
			
			pstmt.setString(1, memberDto.getEmail());
			pstmt.setString(2, memberDto.getPwd());
			pstmt.setString(3, memberDto.getName());
			pstmt.setString(4, LocalDate.now().toString());
			return pstmt;
		});
		
	}

}

