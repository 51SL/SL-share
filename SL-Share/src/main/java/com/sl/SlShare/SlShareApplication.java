package com.sl.SlShare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sl.SlShare.demo")
public class SlShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlShareApplication.class, args);
	}

}
