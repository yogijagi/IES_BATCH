package com.ashokit.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BatchRunDtlsDTO {
	private Integer batchRunSeq;
	private String batchName;
	private String batchRunStatus;
	private Integer instanceNum;
	private Date startDate;
	private Date endDate;
}
