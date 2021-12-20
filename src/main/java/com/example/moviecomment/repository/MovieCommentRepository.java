package com.example.moviecomment.repository;

import com.example.moviecomment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieCommentRepository extends JpaRepository<Comment, Long> {

    @Query(value = "SELECT * FROM comment b WHERE b.movie_id=?1", nativeQuery = true)
    List<Comment> findComments(Long id);
}
