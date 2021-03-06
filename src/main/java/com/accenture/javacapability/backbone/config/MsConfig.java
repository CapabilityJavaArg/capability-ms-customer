package com.accenture.javacapability.backbone.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MsConfig {

	@Value("${capability.microservice.localization}")
	private String localization;

	@Value("${capability.microservice.secure}")
	private boolean secure;
	
	public String getLocalization() {
		return (secure)?localization:"http://"+localization;
	}

	
	
}
