package HC.Blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * @ClassName: HelloController 
 * @Description: TODO
 * @author: huang
 * @date: 2019年3月26日 下午9:59:04
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello world";
	}
}
