package org.example.repository;

import org.example.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AdminRepository extends JpaRepository<AdminEntity,Integer> {
}
