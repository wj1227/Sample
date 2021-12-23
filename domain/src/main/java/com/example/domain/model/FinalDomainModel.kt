package com.example.domain.model

data class FinalDomainModel(
    val id: Long,
    val type: String,
    val aqi: Int,
    val latitude: Double,
    val longitude: Double,
    val nickname: String?,
    val locationName: String?
) : WJDomainLayerData