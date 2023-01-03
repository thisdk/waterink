package io.github.thisdk.core.okhttp.ktx

import android.content.Context
import java.io.File

fun Context.coreOkHttpCacheDir() : File = this.cacheDir.resolve("okhttp_cache")