package com.maxent.k8s;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
	}
	
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	
}
