package org.acme.javafx.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreeterImpl implements Greeter {

	@Override
	public String greet(String name) {
		return "Hi " + name + "! Welcome to Quarkus FX Application!";
	}

}
