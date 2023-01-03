package io.github.thisdk.core.cookie.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.thisdk.core.cookie.AppCookieJar
import io.github.thisdk.core.cookie.AppCookieStore
import io.github.thisdk.core.datastore.AppDataStore
import io.github.thisdk.core.datastore.annotation.CookieDataStore
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CookieModule {
    @Singleton
    @Provides
    fun provideAppCookieJar(@CookieDataStore appDataStore: AppDataStore): AppCookieJar {
        return AppCookieJar(AppCookieStore(appDataStore))
    }
}