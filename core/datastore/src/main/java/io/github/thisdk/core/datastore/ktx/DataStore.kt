package io.github.thisdk.core.datastore.ktx

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.preferencesDataStoreFile
import java.io.File

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "store")
fun Context.coreDataStoreFile(): File = this.preferencesDataStoreFile("store")


val Context.cookieDataStore: DataStore<Preferences> by preferencesDataStore(name = "cookie")
fun Context.coreCookieDataStoreFile(): File = this.preferencesDataStoreFile("cookie")