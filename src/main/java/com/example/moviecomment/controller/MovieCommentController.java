package com.example.moviecomment.controller;

import com.example.moviecomment.model.Comment;
import com.example.moviecomment.model.MovieComments;
import com.example.moviecomment.service.MovieCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class MovieCommentController {

    @Autowired
    private MovieCommentService service;

    @GetMapping("/{movieId}")
    private MovieComments getComments(@PathVariable("movieId") Long movieId) {



        return service.getComments(movieId);


    }
}
