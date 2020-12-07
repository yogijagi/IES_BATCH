package com.ashokit.dto;
import java.sql.Blob;

import lombok.Data;

@Data
public class CoPdfsDTO {
	private Integer coPdfId;

	private String planStatus;

	private String caseNumber;

	private String planName;

	private Blob pdfDocument;

}
