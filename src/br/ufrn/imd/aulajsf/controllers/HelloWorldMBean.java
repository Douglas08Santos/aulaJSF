package br.ufrn.imd.aulajsf.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldMBean {
	public String getWorld() {
		return "Olá JSF!";
	}
}
