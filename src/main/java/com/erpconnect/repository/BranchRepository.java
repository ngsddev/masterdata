package com.erpconnect.repository;

import com.erpconnect.model.BranchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<BranchEntity, Integer> {
}
