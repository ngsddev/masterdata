package com.erpconnect.repository;

import com.erpconnect.model.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankEntity, Integer> {

}
