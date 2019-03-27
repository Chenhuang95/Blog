/**   
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: HC.Blog.domain 
 * @author: huang   
 * @date: 2019年3月27日 上午9:07:08 
 */
package HC.Blog.domain;


/**
 * 描述:
 * 用户实体类
 *
 * @author alex
 * @create 2019-01-14 10:08
 */
public class User {

	private Long id;
	private String name;
	private String email;
	//构造函数
	public User()//无参构造
	{
		
	}
	
	public User(Long id,String name,String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	//
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}


