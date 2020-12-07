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
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDtlsEntity {
	@Id
	@GeneratedValue
    @Column(name = "BATCH_RUN_SEQ")
	private Integer batchRunSeq;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;
	@Column(name = "INSTANCE_NUM")
	private Integer instanceNum;
	
	@Column(name = "START_DATE")
	@CreationTimestamp
	private Date startDate;
	@Column(name = "END_DATE")
	@UpdateTimestamp
	private Date endDate;
}
