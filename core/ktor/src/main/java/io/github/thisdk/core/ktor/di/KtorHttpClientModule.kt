package io.github.thisdk.core.ktor.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.thisdk.core.ktor.config.KtorConfig
import io.ktor.client.*
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object KtorHttpClientModule {
    @Singleton
    @Provides
    fun provideKtorHttpClient(okHttpClient: OkHttpClient): HttpClient {
        return KtorConfig.httpClient(okHttpClient)
    }
}