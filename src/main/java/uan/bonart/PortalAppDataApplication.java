package uan.bonart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import uan.bonart.service.IArtistService;

@SpringBootApplication
@ComponentScan (basePackageClasses = IArtistService.class)

public class PortalAppDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalAppDataApplication.class, args);
	}

}

