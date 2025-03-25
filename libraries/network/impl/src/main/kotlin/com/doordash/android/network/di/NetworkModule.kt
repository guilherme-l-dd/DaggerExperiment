package com.doordash.android.network.di

import com.doordash.android.network.Network
import com.doordash.android.network.NetworkUseCase
import dagger.Binds
import dagger.Module

@Module
interface NetworkModule {
    @Binds
    fun bindNetwork(network: Network): NetworkUseCase
}
