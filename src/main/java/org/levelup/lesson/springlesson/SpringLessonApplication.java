package org.levelup.lesson.springlesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringLessonApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringLessonApplication.class, args);
	}

}
