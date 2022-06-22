package com.example.a9interfacepolimorphizm_practicalwork


class RubToEur : CurrencyConverter {

    override val currencyCode: String
        get() = "EUR"

    override fun convertToRub(rub: Double) {
        println("Convert Rub to Eur")
    }
}
