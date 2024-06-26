package com.example.androidboilerplate.screens.home.model.network


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Author(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)