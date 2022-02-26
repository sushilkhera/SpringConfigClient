package com.sushil.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/")
public class ConfigClientAppController {

	@Value("${env.name}")
	private String env;
	
	@GetMapping(value = "/env")
	public String getEnvironment() {
		return "ConfigClientAppController-[Environment]:"+env;
	}
}
