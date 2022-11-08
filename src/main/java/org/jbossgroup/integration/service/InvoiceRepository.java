package org.jbossgroup.integration.service;
import org.jbossgroup.integration.model.Invoice;
import org.springframework.data.repository.CrudRepository;


public interface InvoiceRepository extends CrudRepository<Invoice,Long> {

}
