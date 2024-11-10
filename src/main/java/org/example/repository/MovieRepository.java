package org.example.repository;

import org.example.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    Optional<MovieEntity> findById(Integer id);

    List<MovieEntity> findByName(String name);
}
