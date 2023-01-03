package io.github.thisdk.core.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

class AppDataStore(private val store: DataStore<Preferences>) {

    suspend fun putString(key: String, value: String) {
        store.edit { setting ->
            setting[stringPreferencesKey(key)] = value
        }
    }

    suspend fun putBoolean(key: String, value: Boolean) {
        store.edit { setting ->
            setting[booleanPreferencesKey(key)] = value
        }
    }

    suspend fun putInt(key: String, value: Int) {
        store.edit { setting ->
            setting[intPreferencesKey(key)] = value
        }
    }

    suspend fun putLong(key: String, value: Long) {
        store.edit { setting ->
            setting[longPreferencesKey(key)] = value
        }
    }

    suspend fun putFloat(key: String, value: Float) {
        store.edit { setting ->
            setting[floatPreferencesKey(key)] = value
        }
    }

    suspend fun putDouble(key: String, value: Double) {
        store.edit { setting ->
            setting[doublePreferencesKey(key)] = value
        }
    }

    suspend fun putStringSet(key: String, value: Set<String>) {
        store.edit { setting ->
            setting[stringSetPreferencesKey(key)] = value
        }
    }

    fun getString(key: String): Flow<String?> {
        return store.data.map { preferences ->
            preferences[stringPreferencesKey(key)]
        }
    }

    fun getBoolean(key: String): Flow<Boolean> {
        return store.data.map { preferences ->
            preferences[booleanPreferencesKey(key)] ?: false
        }
    }

    fun getInt(key: String): Flow<Int> {
        return store.data.map { preferences ->
            preferences[intPreferencesKey(key)] ?: 0
        }
    }

    fun getLong(key: String): Flow<Long> {
        return store.data.map { preferences ->
            preferences[longPreferencesKey(key)] ?: 0L
        }
    }

    fun getFloat(key: String): Flow<Float> {
        return store.data.map { preferences ->
            preferences[floatPreferencesKey(key)] ?: 0f
        }
    }

    fun getDouble(key: String): Flow<Double> {
        return store.data.map { preferences ->
            preferences[doublePreferencesKey(key)] ?: 0.0
        }
    }

    fun getStringSet(key: String): Flow<Set<String>> {
        return store.data.map { preferences ->
            preferences[stringSetPreferencesKey(key)] ?: setOf()
        }
    }

    fun getString4Sync(key: String): String? {
        val preferences = runBlocking { store.data.first() }
        return preferences[stringPreferencesKey(key)]
    }

    fun getStringSet4Sync(key: String): Set<String> {
        val preferences = runBlocking { store.data.first() }
        return preferences[stringSetPreferencesKey(key)] ?: setOf()
    }

}