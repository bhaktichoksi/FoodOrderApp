package com.app.food_order_system.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.app.food_order_system.model.OrderData

@Dao
interface OrderDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(order: OrderData)

    @Query("SELECT * FROM orders WHERE id = :orderId")
    suspend fun getOrderById(orderId: String): OrderData?

    @Query("SELECT * FROM orders")
    fun getAllOrders(): LiveData<List<OrderData>>

    @Query("SELECT * FROM orders WHERE state = :state")
    fun getOrdersByState(state: String): LiveData<List<OrderData>>
}
