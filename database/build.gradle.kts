plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("org.jetbrains.kotlin.plugin.parcelize")
    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp") version "1.7.21-1.0.8"
}

android {
    namespace = "io.github.thisdk.reader.database"
    compileSdk = 33
    defaultConfig {
        minSdk = 27
        targetSdk = 33
        consumerProguardFiles("consumer-rules.pro")
        ksp {
            arg("room.schemaLocation", "$projectDir/schemas")
        }
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

    ksp("androidx.room:room-compiler:2.4.3")
    implementation("androidx.room:room-runtime:2.4.3")
    implementation("androidx.room:room-ktx:2.4.3")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
}