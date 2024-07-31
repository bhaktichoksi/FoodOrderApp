package com.app.food_order_system.network

import com.app.food_order_system.model.OrderData
import retrofit2.Call
import retrofit2.http.GET

interface OrderService {
    @GET("/order_events")
    fun getOrderEvents(): Call<List<OrderData>>
}