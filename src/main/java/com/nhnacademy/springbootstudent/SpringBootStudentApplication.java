package com.nhnacademy.springbootstudent;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStudentApplication {

	public static void main(String[] args) {
		// 객체 생성해서 사용해도 되고, 빌더로도 가능
		SpringApplication.run(SpringBootStudentApplication.class, args);

//		SpringApplication application = new SpringApplication(SpringBootStudentApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);
	}

}
