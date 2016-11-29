package com.briup.tran.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.swing.tree.TreePath;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.briup.bean.Account;
import com.briup.tran.dao.AccountDao;

public class JdbcDaoTemplate implements AccountDao{
	private JdbcTemplate jt;
	
	public void setDataSource(DataSource ds){
		this.jt = new JdbcTemplate(ds);
	}

	public void count(){
	}
	@Override
	public void save(Account acc) throws DataAccessException {
		// TODO Auto-generated method stub
		/**
		 * 查找有多少行，第二个参数为返回的类型
		 */
//		int i = jt.queryForObject("select count(*) from t_account",Integer.class);
//		System.out.println(i);
		/*
		 * 按照条件查找
		 */
		int j = jt.queryForObject("select count(*) from t_account where id=?"
				, Integer.class,0);
		System.out.println(j);
		/*
		 * 按照id找到名字.
		 */
		String name = jt.queryForObject("select balance from t_account where id=?"
				,new Object[]{0},String.class);
		System.out.println(name);
		
		/*
		 * 按照id查找，把查询的结果封装成一个对象
		 */
		Account account = jt.queryForObject("select * from t_account where id=?",new Object[]{0},new RowMapper<Account>() {

			@Override
			public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Account account = new Account();
				account.setId(rs.getInt("id"));
				account.setName(rs.getString("name"));
				account.setBalance(rs.getFloat("balance"));
				return account;
			}
		});
		System.out.println(account);
	}

	@Override
	public boolean update(Account acc) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Account acc) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

}
