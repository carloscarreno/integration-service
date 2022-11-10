package org.jbossgroup.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.springframework.stereotype.Component;

//@Component
public class JpaRouteBuilder extends RouteBuilder {
	
	public void configure() {
		  JaxbDataFormat jaxb = new JaxbDataFormat();
		  jaxb.setContextPath("org.jbossgroup.integration.model");
		  from("jpa:org.jbossgroup.integration.model.Invoice?namedQuery=invoices-query"
		       + "&consumeDelete=false"
		       + "&delay=500"
		       + "&maximumResults=2"
		       + "&repeatCount=3") // El valor 0 se repetira indefinidamente
		  .marshal(jaxb)
		  .log("${body}")
		  .to("file:src/data");
		}
}
