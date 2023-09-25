package com.project.bookmyshow.repositories;

import com.project.bookmyshow.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor,Long> {
    List<Actor> findAllByNameIn(List<String> strings);

}
