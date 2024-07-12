package edu.kh.cooof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // 스프링 스케쥴러를 활성화 하는 어노테이션
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class UfcApplication {

	public static void main(String[] args) {
		SpringApplication.run(UfcApplication.class, args);
	}

}