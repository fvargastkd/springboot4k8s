package com.maxent.cloud.openapi;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class OpenapiApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(OpenapiApplication.class).web(true).run(args);
	}
	
}
