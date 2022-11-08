package org.jbossgroup.integration.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
@Entity
@Table(name = "invoice")
@NamedQuery(name = "invoices-query",query = "select invoice from Invoice invoice ")
public class Invoice implements Serializable {
	
	private static final long serialVersionUID = -1020040498419142780L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "RUC_EMISOR")
	private String rucEmisor;
	
	@Column(name = "NUMERO_DE_DOCUMENTO")
	private String numeroDocumento;
	
	@Column(name = "TOTAL_VALOR_VENTA")
	private Double totalValorVenta;
	
	@Column(name = "IGV")
	private Double igv;
	
	@Column(name = "MONTO_TOTAL_TRIBUTOS")
	private Double montoTotalTtributos;
	
	@Column(name = "IMPORTE_TOTAL")
	private Double importeTotal;

	@Column(name = "FECHA_DE_EMISION")
	private Date fechaEmision;
	
		
	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRucEmisor() {
		return rucEmisor;
	}

	public void setRucEmisor(String rucEmisor) {
		this.rucEmisor = rucEmisor;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Double getTotalValorVenta() {
		return totalValorVenta;
	}

	public void setTotalValorVenta(Double totalValorVenta) {
		this.totalValorVenta = totalValorVenta;
	}

	public Double getIgv() {
		return igv;
	}

	public void setIgv(Double igv) {
		this.igv = igv;
	}

	public Double getMontoTotalTtributos() {
		return montoTotalTtributos;
	}

	public void setMontoTotalTtributos(Double montoTotalTtributos) {
		this.montoTotalTtributos = montoTotalTtributos;
	}

	public Double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(Double importeTotal) {
		this.importeTotal = importeTotal;
	}
    
	public String toString() {
		return this.getNumeroDocumento();
	}
	
}
