package com.example.a9interfacepolimorphizm_practicalwork

object Converters {

    val convertersList = listOf(
        RubToEur(),
        RubToUsd()
    )


    fun get(currencyCode: String): CurrencyConverter {
        var result: CurrencyConverter? = null
        for (converter in convertersList) {
            if (converter.currencyCode == currencyCode) result = converter
        }

        return result
            ?: object : CurrencyConverter {
                override val currencyCode: String
                    get() = currencyCode

                override fun convertToRub(rub: Double) {
                    println("Converter Rub to $currencyCode")
                }
            }
    }
}