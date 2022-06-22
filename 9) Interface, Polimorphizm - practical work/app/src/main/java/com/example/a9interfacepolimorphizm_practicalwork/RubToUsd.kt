package com.example.a9interfacepolimorphizm_practicalwork

class RubToUsd : CurrencyConverter {

    override val currencyCode: String = "USD"

    override fun convertToRub(rub: Double) {
        println("Convert Rub to Usd")
    }
}