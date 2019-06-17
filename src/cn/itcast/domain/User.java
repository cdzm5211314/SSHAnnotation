package cn.itcast.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//定义实体类
@Entity
//定义数据表与数据库
@Table(name="uuser",catalog="ssh_annotation")
public class User {
	
	@Id
	//生成策略
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	//属性名和表列名一致可省略@Column注解
	private String name;
	private Integer age;
	private String sex;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", sex="
				+ sex + "]";
	}
	
}
