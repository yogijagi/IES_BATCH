package com.ashokit.dto;

import java.util.Date;
import lombok.Data;

@Data
public class EligibilityDetailsEntity {
	private Integer edTraceId;
	private String benefitAmt;
	private Integer caseNum;

	private String denialReason;

	private String planName;

	private String planEndDate;

	private String planStartDate;

	private String planStatus;

	private Date createDate;

	private Date updateDate;
}
