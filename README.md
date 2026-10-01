# 🎬 Movie Hub

A modern Android Movie List application built with **Kotlin** and
**Android Studio**. The app displays movies in a clean two-column poster
grid with movie titles, release years, and ratings.

The UI follows a **minimal dark cinematic theme**, inspired by modern
movie-discovery applications.

## 📱 Project Overview

**Movie Hub** is an Android application developed as a practical project
for demonstrating:

-   ListView
-   ImageView
-   Custom Adapter
-   XML layouts
-   Kotlin data classes
-   Android UI design
-   Adaptive two-column movie layout

Each movie is displayed with:

-   🎞️ Movie poster
-   🎬 Movie name
-   📅 Release year
-   ⭐ Movie rating

## ✨ Features

-   Modern dark movie-discovery interface
-   Two movies displayed per row
-   Large portrait movie posters
-   Movie title and metadata
-   Scrollable movie collection
-   Custom `BaseAdapter`
-   Clean and responsive XML layout
-   Status-bar safe layout
-   Bottom navigation-style UI
-   Local drawable images for movie posters

## 🎥 Movies Included

The application currently contains 10 movies:

1.  Avengers: Endgame
2.  Avengers: Infinity War
3.  Captain America: The Winter Soldier
4.  Captain America: Civil War
5.  Fantastic Four
6.  Spider-Man: No Way Home
7.  Doctor Strange
8.  Thor: Ragnarok
9.  Spider-Man: Brand New Day
10. Thunderbolts\*

## 🛠️ Technologies Used

-   **Language:** Kotlin
-   **IDE:** Android Studio
-   **UI:** XML
-   **Platform:** Android
-   **Adapter:** Custom `BaseAdapter`
-   **Main UI Component:** `ListView`
-   **Image Component:** `ImageView`
-   **Data Model:** Kotlin `data class`
-   **Build System:** Gradle

## 📂 Project Structure

``` text
MovieListApp/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com.example.movielistapp/
│           │       ├── MainActivity.kt
│           │       ├── Movie.kt
│           │       └── MovieAdapter.kt
│           │
│           └── res/
│               ├── drawable/
│               │   ├── endgame.jpg
│               │   ├── infinity_war.jpg
│               │   ├── winter_soldier.jpg
│               │   ├── civil_war.jpg
│               │   ├── fantastic_four.jpg
│               │   ├── no_way_home.jpg
│               │   ├── doctor_strange.jpg
│               │   ├── thor_ragnarok.jpg
│               │   ├── brand_new_day.jpg
│               │   └── thunderbolts.jpg
│               │
│               └── layout/
│                   ├── activity_main.xml
│                   └── movie_item.xml
│
└── README.md
```

> The exact Android Studio source folder may appear as `kotlin+java` in
> the Android project view.

## 🧩 Application Architecture

The application follows a simple data-driven UI structure:

``` text
Movie.kt
   ↓
Movie data
   ↓
MainActivity.kt
   ↓
MovieAdapter.kt
   ↓
movie_item.xml
   ↓
ListView
```

### 1. Movie.kt

The `Movie` data class stores information about each movie.

``` kotlin
data class Movie(
    val name: String,
    val poster: Int,
    val rating: String,
    val year: String
)
```

### 2. MainActivity.kt

`MainActivity`:

-   Loads the main XML layout
-   Creates the movie list
-   Creates the `MovieAdapter`
-   Connects the adapter to the `ListView`

### 3. MovieAdapter.kt

The custom `BaseAdapter` converts the movie data into UI elements.

Because the application uses a two-column layout, the adapter displays:

``` text
Movie 1 + Movie 2
Movie 3 + Movie 4
Movie 5 + Movie 6
Movie 7 + Movie 8
Movie 9 + Movie 10
```

### 4. movie_item.xml

This layout defines one row of the movie grid.

Each row contains two movie sections, and each section contains:

``` text
Poster
Movie Name
Year • Rating
```

## 🎨 UI Theme

The application uses a minimal dark cinematic color palette.

  Element                 Color
  ----------------------- -----------
  Main background         `#000000`
  Bottom navigation       `#050505`
  Movie title             `#FFFFFF`
  Secondary information   `#777777`
  Poster background       `#151515`

The design intentionally avoids excessive colors to maintain a clean
movie-streaming-app appearance.

## 🚀 How to Run

### Prerequisites

Make sure you have:

-   Android Studio installed
-   Android SDK installed
-   Kotlin support enabled
-   An Android emulator or physical Android device

### Steps

1.  Open **Android Studio**.
2.  Open the Movie Hub project.
3.  Allow Gradle to finish syncing.
4.  Connect an Android device or start an emulator.
5.  Click **Run ▶**.
6.  Select your target device.
7.  The Movie Hub application will launch.

## 🖼️ Adding Movie Posters

Place all poster images inside:

``` text
app/src/main/res/drawable/
```

Use lowercase filenames with underscores.

Example:

``` text
endgame.jpg
infinity_war.jpg
winter_soldier.jpg
civil_war.jpg
```

The filenames must match the drawable references used in
`MainActivity.kt`.

For example:

``` kotlin
R.drawable.endgame
```

refers to:

``` text
res/drawable/endgame.jpg
```

## 🔧 Customization

You can easily customize the application by changing:

### Movie data

Edit the movie list inside `MainActivity.kt`.

### Colors

Change the color values inside:

``` text
activity_main.xml
movie_item.xml
```

### Poster size

Modify the `ImageView` height in:

``` text
movie_item.xml
```

For example:

``` xml
android:layout_height="250dp"
```

### Number of movies

Add additional `Movie` objects to the movie list. The custom adapter
will automatically arrange them into two columns.

## 📚 Learning Outcomes

This project demonstrates practical knowledge of:

-   Android Activity lifecycle
-   Kotlin programming
-   Data classes
-   ListView
-   ImageView
-   Custom adapters
-   XML layouts
-   Resource management
-   Android drawable resources
-   Dynamic UI population
-   Basic responsive/adaptive UI design

## 🎓 Practical / Assignment

**Experiment:** Create an adaptive UI using ListView and ImageView.

**Application:** Movie Hub

**Main Components:**

-   `ListView`
-   `ImageView`
-   Custom `BaseAdapter`
-   XML layouts
-   Kotlin

## 🔮 Future Improvements

Possible future features include:

-   Movie search
-   Movie categories
-   Favorites/watchlist
-   Movie details screen
-   Trailer integration
-   API-based movie data
-   Firebase database
-   User profiles
-   Dark/light theme switching
-   Movie filtering and sorting

## 👨‍💻 Author

**Rohit Kumar Singh**

MCA Student\
Software Development / Full-Stack Development

## 📄 License

This project is created for educational and academic purposes.
