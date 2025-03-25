package com.doordash.android.merchant

import androidx.lifecycle.ViewModel
import com.doordash.android.network.NetworkUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MerchantViewModel @Inject constructor(
    private val networkUseCase: NetworkUseCase
) : ViewModel() {

    fun getScreenText(): String {
        return "Merchant screen: ${networkUseCase.networkId()}"
    }
}
