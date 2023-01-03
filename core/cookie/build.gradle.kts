plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "io.github.thisdk.core.cookie"
    compileSdk = 33
    defaultConfig {
        minSdk = 27
        targetSdk = 33
        consumerProguardFiles("consumer-rules.pro")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    kapt("com.google.dagger:hilt-android-compiler:2.44.2")
    implementation("com.google.dagger:hilt-android:2.44.2")

    implementation(project(":core:datastore"))

    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.5")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
}