package com.example.a7encapsulationinheritance_practicalwork

import com.example.a7encapsulationinheritance_practicalwork.models.NatureReserve

fun main() {

    val natRes = NatureReserve()

    repeat(5) {
        natRes.live()
    }

    println(natRes.reserve)
}