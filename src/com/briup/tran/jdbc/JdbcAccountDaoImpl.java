package com.briup.tran.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;

import com.briup.bean.Account;
import com.briup.tran.dao.AccountDao;


public class JdbcAccountDaoImpl implements AccountDao{
	private DataSource ds;
	
	@Override
	public void save(Account acc) throws DataAccessException {
		try {
			//获取连接
			Connection conn = ds.getConnection();
			//sql
			String sql = "insert into t_account values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, acc.getId());
			ps.setString(2, acc.getName());
			ps.setDouble(3, acc.getBalance());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean update(Account acc) throws DataAccessException {
		//获取连接
		try {
			Connection conn = ds.getConnection();
			//sql
			String sql = "update t_account set balance=? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, acc.getBalance()-100);
			ps.setInt(2, acc.getId());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
