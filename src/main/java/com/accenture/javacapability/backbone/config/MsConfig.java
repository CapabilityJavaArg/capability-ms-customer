package com.accenture.javacapability.backbone.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MsConfig {

	@Value("${capability.microservice.localization}")
	private String localization;

	public String getLocalization() {
		return localization;
	}

	
	
}
