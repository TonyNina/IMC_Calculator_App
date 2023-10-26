package com.gibbs.myfirstapp.andoidMaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    // en las interfaces no metemos codigo, sino el contrato por asi decirlo
    @GET("/api/1774214209674886/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superheroName:String):Response<SuperHeroDataResponse>
}