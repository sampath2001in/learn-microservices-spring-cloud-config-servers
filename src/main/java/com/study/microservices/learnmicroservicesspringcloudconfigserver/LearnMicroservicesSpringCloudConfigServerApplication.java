package com.study.microservices.learnmicroservicesspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*The @EnableConfigServer annotation makes your Spring Boot application act as a Configuration Server. 
Configuration Server runs on the Tomcat port 8888 and application configuration properties are loaded from native 
search locations.*/
@EnableConfigServer
@SpringBootApplication
public class LearnMicroservicesSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnMicroservicesSpringCloudConfigServerApplication.class, args);
	}

}
