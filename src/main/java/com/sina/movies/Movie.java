package com.sina.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //Represents each document of the Movie's collection
@Data //Takes care of getters/setters
@AllArgsConstructor //constructor takes all the private fields as arguments
@NoArgsConstructor //constructor that takes no parameters
public class Movie {
    @Id //id should be treated as a unique identifier for each movie inside the DB
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference //This will make the DB to only store the ID of the reviews,
    // and reviews will be in a separate collection
    private List<Review> reviewIds;

}
