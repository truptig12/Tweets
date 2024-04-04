package com.truptig.tweets.api

import com.truptig.tweets.model.Tweet
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsApi {

    @GET("v3/b/660e70fbacd3cb34a833308b?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<Tweet>>


    @GET("v3/b/660e70fbacd3cb34a833308b?meta=false")
    @Headers("X-JSON-Path:tweets..category")
    suspend fun getCategories(): Response<List<String>>

}