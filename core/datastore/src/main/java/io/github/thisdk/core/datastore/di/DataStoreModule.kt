package io.github.thisdk.core.datastore.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.thisdk.core.datastore.AppDataStore
import io.github.thisdk.core.datastore.annotation.CookieDataStore
import io.github.thisdk.core.datastore.ktx.cookieDataStore
import io.github.thisdk.core.datastore.ktx.dataStore
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Singleton
    @Provides
    fun provideDataStore(@ApplicationContext context: Context): AppDataStore {
        return AppDataStore(context.dataStore)
    }

    @CookieDataStore
    @Singleton
    @Provides
    fun provideCookieDataStore(@ApplicationContext context: Context): AppDataStore {
        return AppDataStore(context.cookieDataStore)
    }

}