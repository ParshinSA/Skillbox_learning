package com.example.a9interfacepolimorphizm_practicalwork

interface CurrencyConverter {

    val currencyCode: String

    fun convertToRub(rub: Double)
}