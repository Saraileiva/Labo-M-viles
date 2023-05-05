package com.example.labo07

import android.app.Application
import com.example.labo07.data.movies
import com.example.labo07.repositories.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}