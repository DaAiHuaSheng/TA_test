package testSample;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/test" )
public class TestController {
	
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("init")
	public String init(Model model, @RequestParam("userName") String userName) {
		
		TestForm form = new TestForm();
		form.setUserName(userName);
		model.addAttribute("testForm",form);
		
		// TRACE < DEBUG < INFO <  WARN < ERROR
		logger.trace("TRACE log");
		logger.debug("DEBUG log");
		logger.info("INFO log");
		logger.warn("WARN log");
		logger.error("ERROR log");
		
		return "TestDisplay";
	}
}
