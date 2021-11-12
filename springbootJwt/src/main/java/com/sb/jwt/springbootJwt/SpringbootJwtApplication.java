package com.sb.jwt.springbootJwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class SpringbootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtApplication.class, args);
	}
	
	@Bean
	public PasswordEncoder passwordencoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
