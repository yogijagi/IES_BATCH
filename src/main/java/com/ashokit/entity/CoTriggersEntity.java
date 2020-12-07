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
@Table(name = "CO_TRIGGERS")
public class CoTriggersEntity {
	@Id
	@GeneratedValue
    @Column(name = "TRG_ID")
	private Integer trgId;
	@Column(name = "CASE_NUM")
	private Integer caseNum;
	
	@Column(name = "TRG_STATUS")
	private String trgStatus;

	@Column(name = "CREATE_DT")
	@CreationTimestamp
	private Date createDate;
	@Column(name = "UPDATE_DT")
	@UpdateTimestamp
	private Date updateDate;
}
