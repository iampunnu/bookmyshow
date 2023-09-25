package com.project.bookmyshow;

import com.project.bookmyshow.controller.TicketController;
import com.project.bookmyshow.model.Actor;
import com.project.bookmyshow.model.Movie;
import com.project.bookmyshow.repositories.ActorRepository;
import com.project.bookmyshow.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookmyshowApplication implements CommandLineRunner {

    private TicketController ticketController;
    private ActorRepository actorRepository;
    private MovieRepository movieRepository;

    @Autowired
    public  BookmyshowApplication(TicketController ticketController,ActorRepository  actorRepository,MovieRepository movieRepository) {
        this.ticketController = ticketController;
        this.actorRepository=actorRepository;
        this.movieRepository=movieRepository;
        //        Actor actor = new Actor();
//        actor.getName();
//        actor.setName("Naman");
    }

    public static void main(String[] args) {
        SpringApplication.run(BookmyshowApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        // H/W:
        // 0. Create a movie
        Movie movie=new Movie();

        movie.setName("jawaan");
        Actor actor=new Actor();
        actor.setId(1L);
        actor.setName("shahrukh khan");
    //    actorRepository.save(actor);
        Actor actor1=new Actor();
        actor1.setId(2L);
        actor1.setName("deepika");
       // actorRepository.save(actor1);
        List<String> name=new ArrayList<>();
        name.add("shahrukh khan");
        name.add("deepika");
        List<Actor> actors=actorRepository
                .findAllByNameIn(name);
        movie.setActors(actors);
        movieRepository.save(movie);
        // 1. Create a city
        // 2. Create a theatre
        // 3. Add auditorium to a theatre (create a theatre)
        // 4. Create 3 seat types: vip, gold, platinum
        // 5. Create 50 seats in the above auditorium
        // 6. Create a show
        //   showController.createShow(Long movieId, Date startTime, Date endTime, Theatre thetreId)

//        BookTicketResponseDto response = ticketController.bookTicket(
//
//        );
    }


}
