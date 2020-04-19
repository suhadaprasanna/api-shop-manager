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
public class DefaultController {

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(DefaultController.class);
	
	@RequestMapping(value= {"","/"})
	public Object defaultRequest() {
		return "This is a Shop service API";
	}
}
