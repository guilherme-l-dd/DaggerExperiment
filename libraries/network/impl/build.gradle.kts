plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kapt)
}

dependencies {
    implementation(projects.libraries.network.public)

    implementation(libs.dagger.runtime)
    kapt(libs.dagger.compiler)
}
