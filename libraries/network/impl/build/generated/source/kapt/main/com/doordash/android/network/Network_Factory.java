package com.doordash.android.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class Network_Factory implements Factory<Network> {
  @Override
  public Network get() {
    return newInstance();
  }

  public static Network_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Network newInstance() {
    return new Network();
  }

  private static final class InstanceHolder {
    static final Network_Factory INSTANCE = new Network_Factory();
  }
}
