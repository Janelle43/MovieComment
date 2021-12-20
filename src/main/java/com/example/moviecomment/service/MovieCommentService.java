package com.example.moviecomment.service;

import com.example.moviecomment.model.Comment;
import com.example.moviecomment.model.MovieComments;
import com.example.moviecomment.repository.MovieCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieCommentService {

    @Autowired
    private MovieCommentRepository repository;


    public MovieComments getComments(Long movieId) {
        MovieComments movieComments = new MovieComments();
        movieComments.setComments(repository.findComments(movieId));

        return movieComments;
    }
}
