package or.test.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title TestController.java
 * @Package: com.gil.springbootjar.controller
 * @Description: 测试用的Controller
 *
 * @Author: laigc
 * @Date: 2016年4月5日 下午4:40:49
 *
 *        Copyright @ 2016 Corpration Name
 * 
 */
@Controller
@RequestMapping("/")
public class TestController {
	@RequestMapping("/hello")
	@ResponseBody()
	String home() {
		return "Hello World!";
	}

}
