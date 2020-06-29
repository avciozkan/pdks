package com.inomera.pdks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
@ComponentScans({ @ComponentScan(basePackages = "com.inomera.pdks.rest") })
public class PdksApplication {
	static {
		System.setProperty("jasypt.encryptor.password", "SimplePassword");
	}

	public static void main(String[] args) {
		SpringApplication.run(PdksApplication.class, args);
	}

}
