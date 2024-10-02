package com.example.nemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Moviesapp, Long> {
}

