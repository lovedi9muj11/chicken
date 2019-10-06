package com.xunxas.chicken.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.xunxas.chicken.model.Model;

@Service
public class ChickenServiceImpl implements ChickenService{

	@Autowired JdbcTemplate jdbcTemplate;
	
	@Override
	public Model findCust() {
		String sql = "select * from CUSTOMER_MANUAL";
		return jdbcTemplate.queryForObject(sql, new mapCustomer());
	}
	
	private static final class mapCustomer implements RowMapper<Model> {
		@Override
		public Model mapRow(ResultSet rs, int rowNum) throws SQLException {
			Model xx = new Model();
			xx.setId(rs.getInt("ID"));
			return xx;
		}

	}

}
