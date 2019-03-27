package HC.Blog.repository;
import java.util.List;

import HC.Blog.domain.User;
/** 
 * @ClassName: UserRepository 
 * @Description: TODO
 * @author: huang
 * @date: 2019年2月28日 下午2:40:50  
 */
public interface UserRepository {
	/**
	 * 新增或修改用户
	 * @param user
	 * @return
	 */
	User saveOrUpdateUser(User user);
	/**
	 * 废除用户
	 * @param id
	 */
	void deleteUser(Long id);
	/**
	 * 根据用户id获取用户
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
	/**
	 * 获取所有用户的列表
	 * @return
	 */
	List<User> listUser();
}

