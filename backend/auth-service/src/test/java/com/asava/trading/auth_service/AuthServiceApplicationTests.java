package com.asava.trading.auth_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration;
import org.springframework.cloud.config.client.ConfigClientAutoConfiguration;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@EnableAutoConfiguration(exclude = {
    EurekaClientAutoConfiguration.class,
    EurekaDiscoveryClientConfiguration.class,
    ConfigClientAutoConfiguration.class
})
class AuthServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
