package com.jsf.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "userData", eager = true)
@RequestScoped
public class UserData implements Serializable {
	/**
	 * first change
	 */
	private static final long serialVersionUID = 1L;
	// @ManagedProperty(value = "name")
	private String name;

	private String helloSaid;

	public String getHelloSaid() {
		return helloSaid;
	}

	public void setHelloSaid(String helloSaid) {
		this.helloSaid = helloSaid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		return "login";
	}

	/**
	 * better to return null so that it can be used in
	 * non-Ajax examples as well.
	 */
	public String sayHello() {
		// return "Hi" + name;
		helloSaid = "hello " + name;
		return null;
	}
}
