package com.adso.retrofit2711891

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adso.retrofit2711891.data.CreditCardRepository
import com.adso.retrofit2711891.model.CreditCard
import com.adso.retrofit2711891.model.CreditCardResponse
import kotlinx.coroutines.launch

class CreditCardViewModel: ViewModel() {
    private val  repository = CreditCardRepository()
    private val _creditCards = MutableLiveData<CreditCardResponse>()
    val creditCard: LiveData<CreditCardResponse> = _creditCards

    fun fetchCreditCards(){
        viewModelScope.launch {
            try {
                val cards = repository.getCreditCards()
                _creditCards.value = cards
                Log.e("FetchCreditCard", _creditCards.value.toString());
            } catch (e: Exception){
                //HANDLE ERROR
                Log.e("fetchCreditCards",e.message.toString());
            }
        }
    }

}