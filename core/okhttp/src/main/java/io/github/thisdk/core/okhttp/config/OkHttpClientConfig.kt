package io.github.thisdk.core.okhttp.config

import android.content.Context
import io.github.thisdk.core.cookie.AppCookieJar
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.net.Proxy
import java.util.concurrent.TimeUnit

object OkHttpClientConfig {

    fun okHttpClient(context: Context, appCookieJar: AppCookieJar): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder.cache(Cache(context.cacheDir.resolve("okhttp_cache"), 16 * 1024 * 1024))
        return okHttpClientConfig(builder, appCookieJar)
    }

    fun noCacheOkHttpClient(appCookieJar: AppCookieJar): OkHttpClient {
        return okHttpClientConfig(OkHttpClient.Builder(), appCookieJar)
    }

    private fun okHttpClientConfig(
        builder: OkHttpClient.Builder, appCookieJar: AppCookieJar
    ): OkHttpClient {
        return builder.apply {
            callTimeout(120, TimeUnit.SECONDS)
            connectTimeout(60, TimeUnit.SECONDS)
            writeTimeout(60, TimeUnit.SECONDS)
            readTimeout(60, TimeUnit.SECONDS)
            retryOnConnectionFailure(true)
            cookieJar(appCookieJar)
            followRedirects(true)
            proxy(Proxy.NO_PROXY)
        }.build()
    }

}