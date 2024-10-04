package com.adso.retrofit2711891.services

import com.adso.retrofit2711891.model.CreditCard
import com.adso.retrofit2711891.model.CreditCardResponse
import retrofit2.http.GET

interface CreditCardService {
    interface ApiService{
        @GET("credit_cards")
        suspend fun getCreditCards(): CreditCardResponse
    }
}