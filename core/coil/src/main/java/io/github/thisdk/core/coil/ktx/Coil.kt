package io.github.thisdk.core.coil.ktx

import android.content.Context
import java.io.File

fun Context.coreCoilCacheDir() : File = this.cacheDir.resolve("image_cache")