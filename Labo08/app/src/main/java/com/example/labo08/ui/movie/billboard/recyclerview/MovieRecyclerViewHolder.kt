package com.example.labo08.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.labo08.data.model.MovieModel
import com.example.labo08.databinding.MovieItemBinding

class MovieRecyclerViewHolder(private val binding: MovieItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.idCardViewMovie.setOnClickListener {
            clickListener(movie)
        }
    }
}