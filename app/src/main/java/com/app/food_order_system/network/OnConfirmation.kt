package com.app.food_order_system.network

interface OnConfirmation<T> {
    fun onConfirmation(item: T)
    fun onCancel()
}