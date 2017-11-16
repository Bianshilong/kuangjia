package com.bsl.spring.jdbc;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	
	private static final Logger logger = Logger.getLogger(Test.class);
	private JdbcTemplate jdbcTemplate;
	private ApplicationContext ctx;
	//初始化
	public void init() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
	}
	//插入数据库记录
	public int insert(Users users) {
		
		String sql = "insert into users(name,pass) values ('"+users.getName()+"','"+users.getPass()+"')";
		int count = this.jdbcTemplate.update(sql);
		return count;
	}
	//更新数据库记录
	public int update(Users users) {
		
		String sql = "update users set name =?,pass=? where id =?";
		int count = this.jdbcTemplate.update(sql,users.getName(),users.getPass(),users.getId());
		return count;
		
	}
	//删除数据库记录
	public int delete(Long id) {
		
		String sql = "delete from users where id =?";
		int  count = this.jdbcTemplate.update(sql,id);
		return count;
		
	}
	//获取指定Id的记录，并将其转换为Users对象
	public Users getOne(Long id) {
		
		String sql = "select * from users where id ="+id;
		//new BeanPropertyRowMapper<T>(T.class) 将查询到的单条记录转换为一个对象
		Users users =this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Users>(Users.class));
		return users;
	}
	//获取符合指定name的记录的数目
	public Long getCount(String name) {
		
		String sql = "select count(*) from users where name='"+name+"'";
//		String sql = "select count(*) from users where name=?";
//		return this.jdbcTemplate.queryForLong(sql,name);//在4.3.3中以及遗弃该方法
		return this.jdbcTemplate.queryForObject(sql, Long.class);
	}
	//获取全部记录，并转换成对象，添加到List集合中
	public List<Users> getUsersList(){
		
		String sql = "select * from users";
		List<Users> usersList = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<Users>(Users.class)); 
		return usersList;
	}
	//获取根据制定对象的name和pass来获取所有符合条件的记录，并将其转换为对象，放入list集合中
	public List<Users> getUsersList(Users users){
		//1=1，避免where查询没有条件，产生异常
		String sql = "select * from users where 1=1 and name =? and pass=?";
		List<Users> usersList = this.jdbcTemplate.query(sql, new Object[] {users.getName(),users.getPass()}
			, new BeanPropertyRowMapper<Users>(Users.class));
		return usersList;
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.init();
//		Users users = new Users();
//		users.setId(3L);
//		users.setName("lisi");
//		users.setPass("666777");
//		logger.info(test.insert(users));
//		logger.info(test.update(users));
//		Users users = test.getOne(1L);
//		logger.info(users);
		
//		List<Users> usersList = test.getUsersList();
//		logger.info(usersList);
//		List<Users> usersList = test.getUsersList(users);
//		logger.info(usersList);
//	
		logger.info(test.getCount("zhangsan"));
//		List<Users> usersList = test.getUsersList(users);
//		logger.info(usersList.size());
//		for (Users users2 : usersList) {
//			logger.info(users2);
//		}
//		logger.info(test.delete(5L));
	}
}
