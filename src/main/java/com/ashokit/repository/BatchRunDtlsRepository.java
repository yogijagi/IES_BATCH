package com.ashokit.repository;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.BatchRunDtlsEntity;
public interface BatchRunDtlsRepository  extends JpaRepository<BatchRunDtlsEntity,Serializable>{

}
