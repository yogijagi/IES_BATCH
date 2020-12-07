package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityDetailsEntity {
	@Id
	@GeneratedValue
    @Column(name = "ED_TRACE_ID")
	private Integer edTraceId;
	@Column(name = "BENEFIT_AMT")
	private String benefitAmt;
	@Column(name = "CASE_NUM")
	private Integer caseNum;
	
	@Column(name = "DENIAL_REASON")
	private String denialReason;
	@Column(name = "PLAN_NAME")
	private String planName;
	@Column(name = "PLAN_END_DT")
	private String planEndDate;
	@Column(name = "PLAN_START_DT")
	private String planStartDate;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "CREATE_DT")
	@CreationTimestamp
	private Date createDate;
	@Column(name = "UPDATE_DT")
	@UpdateTimestamp
	private Date updateDate;
}
