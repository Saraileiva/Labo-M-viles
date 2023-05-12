package com.example.labo08

import android.app.Application
import com.example.labo08.data.movies
import com.example.labo08.repositories.MovieRepository


class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}