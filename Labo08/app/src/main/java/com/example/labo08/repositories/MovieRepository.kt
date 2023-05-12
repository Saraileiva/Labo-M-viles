package com.example.labo08.repositories

import com.example.labo08.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {

    fun getMovies() = movies
    fun addMovies(movie: MovieModel) = movies.add(movie)
}