package com.adso.retrofit2711891.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.adso.retrofit2711891.services.CreditCardService.ApiService

object RetrofitInstance {
    private const val BASE_URL = "https://random-data-api.com/api/v2/credit_cards"
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val CreditCardService : ApiService by lazy {
        retrofit.create( ApiService::class.java)
    }
}


