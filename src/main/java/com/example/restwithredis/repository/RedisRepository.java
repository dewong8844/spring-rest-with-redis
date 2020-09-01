package com.example.restwithredis.repository;

import java.util.Map;

import com.example.restwithredis.model.Movie;

public interface RedisRepository {

    /**
     * Return all movies
     */
    Map<Object, Object> findAllMovies();

    /**
     * Add key-value pair to Redis
     */
    void add(Movie movie);

    /**
     * Delete key-value pair in Redis
     */
    void delete(String id);

    /**
     * Find a movice
     */
    Movie findMovie(String id);
}