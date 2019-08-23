package org.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudConfigController {
	@Value("${test.property}")
	private String testProperty;

	@Value("${test.local.property}")
	private String localTestProperty;

	@GetMapping("/")
	public String test() {
		StringBuilder builder = new StringBuilder();
		builder.append("test property - ").append(testProperty).append(" ")
				.append("local property - ").append(localTestProperty);
		return builder.toString();
	}
}
