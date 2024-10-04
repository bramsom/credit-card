package com.adso.retrofit2711891.data

import com.adso.retrofit2711891.model.CreditCardResponse
import com.adso.retrofit2711891.services.RetrofitInstance

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.CreditCardService
    suspend fun getCreditCards():CreditCardResponse{
        return creditCardService.getCreditCards()
    }
}