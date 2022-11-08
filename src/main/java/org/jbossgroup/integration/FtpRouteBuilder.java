package org.jbossgroup.integration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.jbossgroup.integration.model.Invoice;
import org.springframework.stereotype.Component;

@Component
public class FtpRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		JaxbDataFormat jaxb = new JaxbDataFormat();
		jaxb.setContextPath(Invoice.class.getPackage().getName());
						  
		from("ftp:ftpuser@192.168.56.108/data?password=password&move=.done")
		 .log("${body}")
		 .unmarshal(jaxb)
		 .to("jpa:org.jbossgroup.integration.model.Invoice");

	}

}
