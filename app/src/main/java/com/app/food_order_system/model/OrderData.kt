package com.app.food_order_system.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "orders")
data class OrderData(
    @PrimaryKey val id: String,
    var state: String,
    val price: Int,
    val item: String,
    val customer: String,
    val shelf: String,
    val idealShelf: String,
    val timestamp: Long,
    val destination: String,
    var stateHistory: List<String> = listOf()
)



