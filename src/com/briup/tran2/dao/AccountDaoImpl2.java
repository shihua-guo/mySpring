package com.briup.tran2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.datasource.DataSourceUtils;

import com.briup.bean.Account;

public class AccountDaoImpl2 implements AccountDao{
	private DataSource ds;
	@Override
	public void save(Account acc) throws DataAccessException {
		Connection conn = null;
		try {
			//获取连接
			/**
			 * 不能这样获取连接conn，因为要保证和service层拿的是同一个conn
			//conn = ds.getConnection();
			//sql
			 */
			
			//要这样拿conn才能保证和service层拿的是同一个conn
			conn = DataSourceUtils.getConnection(ds);
			String sql = "insert into t_account values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, acc.getId());
			ps.setString(2, acc.getName());
			ps.setDouble(3, acc.getBalance());
			ps.execute();
			ps.close();
			
			//不能关闭conn，因为这样就不能在service层拿到conn对象了
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	

}
