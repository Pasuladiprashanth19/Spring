package com.depu.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
	
	@Bean
	public Samsung getphonne() {
		return new Samsung();
	}
	

}
