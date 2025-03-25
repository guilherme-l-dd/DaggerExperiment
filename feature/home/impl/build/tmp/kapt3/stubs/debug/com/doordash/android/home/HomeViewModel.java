package com.doordash.android.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/doordash/android/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "networkUseCase", "Lcom/doordash/android/network/NetworkUseCase;", "(Lcom/doordash/android/network/NetworkUseCase;)V", "getScreenText", "", "impl_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.doordash.android.network.NetworkUseCase networkUseCase = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.doordash.android.network.NetworkUseCase networkUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScreenText() {
        return null;
    }
}