package com.example.a8abstractions_practicalwork.models

abstract class BankCard {

    var balance: Double = 0.0

    abstract fun replenishBalance(amountMoney: Double)
    abstract fun payPurchase(amountMoney: Double): Boolean

    fun getBalanceInformation(): Double {
        return balance
    }

}
