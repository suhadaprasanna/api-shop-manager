/**
 * 
 */
package api.shop.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suhada
 *
 */
@RestController
public class TestController {

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value= {"/test"})
	public Object test() {
		return "This is a Shop service API test1 path";
	}
	
	@RequestMapping(value= {"/test2"})
	public Object test2() {
		return "This is a Shop service API test2 path";
	}
	
	@RequestMapping(value= {"/test3"})
	public Object test3() {
		return "This is a Shop service API test2 path";
	}
}
