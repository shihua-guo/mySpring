package com.briup.tran.hibernate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.briup.bean.Account;
import com.briup.tran.dao.AccountDao;

public class HibernateTemplateAccountDao implements AccountDao{
	private HibernateTemplate ht;
	@Override
	public void save(Account acc) throws DataAccessException {
		System.out.println(ht);
		String hql = "from Account a where a.id=?";
		List<Account> a =  ht.find(hql,acc.getId());
		System.out.println(a);
		System.out.println(a.toString());
	}

	
	@Override
	public boolean update(Account acc) throws DataAccessException {
		/*
		 * 使用jdbc的方式进行操作
		 */
		ht.execute(new HibernateCallback<Account>() {
			@Override
			public Account doInHibernate(Session session) throws HibernateException, SQLException {
				/*session.beginTransaction();
				session.update(acc);
				session.getTransaction().commit();*/
				session.doWork(new Work() {
					
					@Override
					public void execute(Connection conn) throws SQLException {
						acc.setBalance(9999);
						Statement s = conn.createStatement();
						String sql = "update t_account set balance="
						+acc.getBalance()+" where id="+acc.getId();
						s.executeQuery(sql);
						conn.commit();
					}
				});
				return null;
			}
			
		});
		ht.saveOrUpdate(acc);
		return true;
	}

	@Override
	public boolean delete(Account acc) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.ht = new HibernateTemplate(sessionFactory);
	}
}
