package org.example.repository;

import org.example.entity.SuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface SuggestionRepository extends JpaRepository<SuggestionEntity,Integer> {
}
