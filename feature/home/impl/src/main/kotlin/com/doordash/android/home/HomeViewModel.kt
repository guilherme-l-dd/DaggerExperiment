package com.doordash.android.home

import androidx.lifecycle.ViewModel
import com.doordash.android.network.NetworkUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val networkUseCase: NetworkUseCase,
) : ViewModel() {

    fun getScreenText(): String {
        return "Home screen: ${networkUseCase.networkId()}"
    }
}
