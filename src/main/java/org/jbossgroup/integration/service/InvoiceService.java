package org.jbossgroup.integration.service;

import java.util.Optional;
import org.jbossgroup.integration.service.InvoiceRepository;
import org.jbossgroup.integration.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
	
	private final InvoiceRepository invoices;

	  @Autowired
	  public InvoiceService(InvoiceRepository invoices) {
	    this.invoices = invoices;
	  }


	  public Invoice findById(Long id) {
	    Optional<Invoice> invoice = invoices.findById(id);
	    if (!invoice.isPresent()) {
	      throw new IllegalStateException("Invoice could not found for given id:" + id);
	    }
	    return invoice.get();
	  }

	  public Iterable<Invoice> findAll() {
	    return invoices.findAll();
	  }

	  public void save(Invoice Invoice) {
	    invoices.save(Invoice);
	  }
	
	
}
