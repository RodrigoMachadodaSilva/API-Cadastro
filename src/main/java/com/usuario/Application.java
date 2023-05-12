package com.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.usuario.core.io.Base64ProtocolResolver;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var app = new SpringApplication(Application.class);
		app.addListeners(new Base64ProtocolResolver());
		app.run(args);
		//SpringApplication.run(Application.class, args);
	}

}
