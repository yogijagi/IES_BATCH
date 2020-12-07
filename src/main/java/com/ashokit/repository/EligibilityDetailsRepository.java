package com.ashokit.repository;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ashokit.entity.EligibilityDetailsEntity;
public interface EligibilityDetailsRepository  extends JpaRepository<EligibilityDetailsEntity,Serializable>{

}
