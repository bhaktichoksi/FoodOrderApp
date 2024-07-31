package com.app.food_order_system.model

data class OrderStats(
    val trashed: Int,
    val delivered: Int,
    val totalSales: Double,
    val totalWaste: Double,
    val totalRevenue: Double
)
