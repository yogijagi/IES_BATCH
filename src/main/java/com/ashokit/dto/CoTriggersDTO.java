package com.ashokit.dto;

import java.util.Date;
import lombok.Data;
@Data
public class CoTriggersDTO {
	private Integer trgId;
	private Integer caseNum;
	private String trgStatus;
	private Date createDate;
	private Date updateDate;
}
