package com.example.dark_theme

import retrofit2.Call
import retrofit2.http.GET

interface Interface {
    @GET("planetary/apod?api_key=apQXw8RXFbYjFbLtgQKh7U6xnK6AS1anTR2uFAdj")
    fun nasaCall() : Call<NasaBode>
}
// https://api.nasa.gov/planetary/apod?api_key=apQXw8RXFbYjFbLtgQKh7U6xnK6AS1anTR2uFAdj