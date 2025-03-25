package com.doordash.android.network.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/doordash/android/network/di/NetworkModule;", "", "bindNetwork", "Lcom/doordash/android/network/NetworkUseCase;", "network", "Lcom/doordash/android/network/Network;", "impl"})
public abstract interface NetworkModule {
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.doordash.android.network.NetworkUseCase bindNetwork(@org.jetbrains.annotations.NotNull()
    com.doordash.android.network.Network network);
}