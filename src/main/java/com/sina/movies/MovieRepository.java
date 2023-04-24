package com.sina.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    //Spring data MongoDB will understand what we are trying to do from here
    Optional<Movie> findMovieByImdbId(String imdbId);

}
