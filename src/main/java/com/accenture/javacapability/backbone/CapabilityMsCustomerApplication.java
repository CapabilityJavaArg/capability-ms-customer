package com.accenture.javacapability.backbone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

import com.accenture.javacapability.backbone.config.MsConfig;

@SpringBootApplication(scanBasePackages={"com.accenture.javacapability.backbone"})
@EnableEurekaClient
@EnableCircuitBreaker
@Import(MsConfig.class)
public class CapabilityMsCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapabilityMsCustomerApplication.class, args);
	}
}
