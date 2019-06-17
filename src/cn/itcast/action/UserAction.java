package cn.itcast.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 表现层
 * 
 * @ClassName: UserAction
 * @Description: TODO 描述
 * @author ChenD
 * @date 2017-3-28 下午3:38:19
 */

@Controller("userAction")
@Scope("prototype")
@Namespace("/")
@ParentPackage("struts-default")
public class UserAction extends ActionSupport implements ModelDriven<User> {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	private User user = new User();
	public User getModel() {
		return user;
	}

	@Action(value = "user_add", results = { @Result(name = "addsuccess", location = "/index.jsp") })
	public String add() {

		userService.saveUser(user);
		return "addsuccess";
	}

}
