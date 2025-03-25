package com.doordash.android.home;

import com.doordash.android.network.NetworkUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<NetworkUseCase> networkUseCaseProvider;

  public HomeViewModel_Factory(Provider<NetworkUseCase> networkUseCaseProvider) {
    this.networkUseCaseProvider = networkUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(networkUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<NetworkUseCase> networkUseCaseProvider) {
    return new HomeViewModel_Factory(networkUseCaseProvider);
  }

  public static HomeViewModel newInstance(NetworkUseCase networkUseCase) {
    return new HomeViewModel(networkUseCase);
  }
}
