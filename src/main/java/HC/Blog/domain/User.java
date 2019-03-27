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

    private long id; // 用户的唯一标识
    private String name;
    private int age;

    public User() {
    }

    public User(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
