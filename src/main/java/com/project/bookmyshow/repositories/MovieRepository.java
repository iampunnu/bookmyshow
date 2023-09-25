package com.project.bookmyshow.repositories;

import com.project.bookmyshow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
