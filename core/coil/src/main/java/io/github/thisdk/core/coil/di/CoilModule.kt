package io.github.thisdk.core.coil.di

import android.content.Context
import coil.ImageLoader
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.thisdk.core.coil.coil.CoilConfig
import io.github.thisdk.core.okhttp.annotation.NoCacheOkHttpClient
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoilModule {
    @Singleton
    @Provides
    fun provideImageLoader(
        @ApplicationContext context: Context,
        @NoCacheOkHttpClient okHttpClient: OkHttpClient
    ): ImageLoader {
        return CoilConfig.imageLoader(context, okHttpClient)
    }
}