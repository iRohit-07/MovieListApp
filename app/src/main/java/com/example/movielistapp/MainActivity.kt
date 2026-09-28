package com.example.movielistapp

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieListView = findViewById<GridView>(R.id.movieListView)

        val movies = listOf(
            Movie(
                "Avengers: Endgame",
                R.drawable.endgame,
                "8.4",
                "2019"
            ),

            Movie(
                "Avengers: Infinity War",
                R.drawable.infinity_war,
                "8.4",
                "2018"
            ),

            Movie(
                "Captain America: The Winter Soldier",
                R.drawable.winter_soldier,
                "7.7",
                "2014"
            ),

            Movie(
                "Guardians of the Galaxy",
                R.drawable.guardians_of_the_galaxy,
                "8.0",
                "2014"
            ),

            Movie(
                "Captain America: Civil War",
                R.drawable.civil_war,
                "7.8",
                "2016"
            ),

            Movie(
                "Shang-Chi and the Legend of the Ten Rings",
                R.drawable.shang_chi,
                "7.4",
                "2021"
            ),
            Movie(
                name = "Fantastic Four",
                poster = R.drawable.fantastic_four,
                rating = "6.8",
                year = "2025"
            ),
            Movie(
                name = "Spider-Man: No Way Home",
                poster = R.drawable.no_way_home,
                rating = "8.1",
                year = "2021"
            ),
            Movie(
                name = "Doctor Strange",
                poster = R.drawable.doctor_strange,
                rating = "7.5",
                year = "2016"
            ),
            Movie(
                name = "Thor: Ragnarok",
                poster = R.drawable.thor_ragnarok,
                rating = "7.9",
                year = "2017"
            ),
            Movie(
                name = "Spider-Man: Brand New Day",
                poster = R.drawable.brand_new_day,
                rating = "8.0",
                year = "2026"
            ),
            Movie(
                name = "Thunderbolts*",
                poster = R.drawable.thunderbolts,
                rating = "7.4",
                year = "2025"
            )

        )

        movieListView.adapter = MovieAdapter(this, movies)
    }
}