package com.springprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesApplication.class, args);
	}

}
