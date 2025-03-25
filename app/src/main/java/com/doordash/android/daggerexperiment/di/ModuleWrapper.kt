package com.doordash.android.daggerexperiment.di

import com.doordash.android.network.di.NetworkModule
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
object ModuleWrapper