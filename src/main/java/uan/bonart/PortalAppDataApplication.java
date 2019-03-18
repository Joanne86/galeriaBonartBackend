package uan.bonart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"uan.bonart.service"})
@EntityScan("uan.bonart.entities")
@EnableJpaRepositories("uan.bonart.repositories")
public class PortalAppDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalAppDataApplication.class, args);
	}

}

