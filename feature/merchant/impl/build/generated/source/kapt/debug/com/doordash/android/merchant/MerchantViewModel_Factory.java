package com.doordash.android.merchant;

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
public final class MerchantViewModel_Factory implements Factory<MerchantViewModel> {
  private final Provider<NetworkUseCase> networkUseCaseProvider;

  public MerchantViewModel_Factory(Provider<NetworkUseCase> networkUseCaseProvider) {
    this.networkUseCaseProvider = networkUseCaseProvider;
  }

  @Override
  public MerchantViewModel get() {
    return newInstance(networkUseCaseProvider.get());
  }

  public static MerchantViewModel_Factory create(Provider<NetworkUseCase> networkUseCaseProvider) {
    return new MerchantViewModel_Factory(networkUseCaseProvider);
  }

  public static MerchantViewModel newInstance(NetworkUseCase networkUseCase) {
    return new MerchantViewModel(networkUseCase);
  }
}
