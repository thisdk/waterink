package io.github.thisdk.core.okhttp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.thisdk.core.cookie.AppCookieJar
import io.github.thisdk.core.okhttp.annotation.NoCacheOkHttpClient
import io.github.thisdk.core.okhttp.config.OkHttpClientConfig
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OkHttpClientModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(
        @ApplicationContext context: Context,
        appCookieJar: AppCookieJar
    ): OkHttpClient {
        return OkHttpClientConfig.okHttpClient(context, appCookieJar)
    }

    @NoCacheOkHttpClient
    @Singleton
    @Provides
    fun provideNoCacheOkHttpClient(
        appCookieJar: AppCookieJar
    ): OkHttpClient {
        return OkHttpClientConfig.noCacheOkHttpClient(appCookieJar)
    }

}