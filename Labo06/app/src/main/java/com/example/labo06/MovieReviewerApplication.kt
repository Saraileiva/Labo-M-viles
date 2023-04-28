package com.example.labo06

import android.app.Application
import com.example.labo06.data.movies
import com.example.labo06.repositories.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}