package com.ashokit.entity;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CO_PDFS")
public class CoPdfsEntity {
	@Id
	@GeneratedValue
	@Column(name = "CO_PDF_ID")
	private Integer coPdfId;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "CASE_NUMBER")
	private String caseNumber;
	@Column(name = "PLAN_NAME")
	private String planName;
	@Column(name = "PDF_DOCUMENT")
	private Blob pdfDocument;

}
