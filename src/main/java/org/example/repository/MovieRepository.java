package org.example.repository;

import org.example.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    List<MovieEntity> findByName(String name);
}
