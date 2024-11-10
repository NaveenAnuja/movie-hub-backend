package org.example.repository;

import org.example.entity.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ReportRepository extends JpaRepository<ReportEntity,Integer> {
}
