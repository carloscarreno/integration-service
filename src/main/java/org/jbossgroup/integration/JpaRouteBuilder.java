package org.jbossgroup.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.springframework.stereotype.Component;

//@Component
public class JpaRouteBuilder extends RouteBuilder {
	
	public void configure() {
		  JaxbDataFormat jaxb = new JaxbDataFormat();
		  jaxb.setContextPath("org.jbossgroup.integration.model");
		  from("jpa:org.jbossgroup.integration.model.Invoice?consumeDelete=false")
		  .marshal(jaxb)
		  .log("${body}")
		  .to("file:src/data");
		}
}
