package cn.itcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

/**
 * 业务层
 * @ClassName: UserService
 * @Description: TODO 描述
 * @author ChenD
 * @date 2017-3-28 下午3:29:02
 */

@Service("userService")
//添加事务
@Transactional
public class UserService {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	public void saveUser(User user){
		
		userDao.save(user);
		
	}
	
}
