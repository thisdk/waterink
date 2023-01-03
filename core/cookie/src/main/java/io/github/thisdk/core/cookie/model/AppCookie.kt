package io.github.thisdk.core.cookie.model

import kotlinx.serialization.Serializable

@Serializable
data class AppCookie(
    val name: String,
    val value: String,
    val expiresAt: Long,
    val domain: String,
    val path: String,
    val secure: Boolean,
    val httpOnly: Boolean,
    val persistent: Boolean,
    val hostOnly: Boolean
)
