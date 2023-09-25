package com.project.bookmyshow.repositories;

import com.project.bookmyshow.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {
    Show findByIdEquals(Long id);

}
