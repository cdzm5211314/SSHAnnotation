package cn.itcast.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import cn.itcast.domain.User;


/**
 * 数据层
 * @ClassName: UserDao
 * @Description: TODO 描述
 * @author ChenD
 * @date 2017-3-28 下午3:22:47
 */

@Repository("userDao")
public class UserDao extends HibernateDaoSupport{

	@Autowired
	@Qualifier("sessionFactory")
	//给父类注入sessionFactory
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
	//保存用户
	public void save(User user){
		
		this.getHibernateTemplate().save(user);
	}
	
}
