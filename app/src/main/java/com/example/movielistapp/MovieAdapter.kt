package com.example.movielistapp

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MovieAdapter(
    context: Context,
    private val movies: List<Movie>
) : ArrayAdapter<Movie>(context, 0, movies) {

    private var selectedPosition = -1

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val view = convertView
            ?: LayoutInflater.from(context)
                .inflate(R.layout.movie_item, parent, false)

        val movie = movies[position]

        val poster = view.findViewById<ImageView>(R.id.moviePoster)
        val name = view.findViewById<TextView>(R.id.movieName)
        val info = view.findViewById<TextView>(R.id.movieInfo)

        poster.setImageResource(movie.poster)
        name.text = movie.name
        info.text = "${movie.year} • ⭐ ${movie.rating}"

        if (position == selectedPosition) {
            view.setBackgroundColor(Color.DKGRAY)
        } else {
            view.setBackgroundColor(Color.TRANSPARENT)
        }

        view.setOnClickListener {
            selectedPosition = position
            notifyDataSetChanged()
        }

        return view
    }
}