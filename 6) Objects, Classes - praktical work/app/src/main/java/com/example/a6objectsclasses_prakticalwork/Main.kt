package com.example.a6objectsclasses_prakticalwork

import com.example.a6objectsclasses_prakticalwork.models.Tv

fun main() {

    val boschTv = Tv("Bosch", "IJN165", 12.5)
    val samsungTv = Tv("Samsung", "DSA2124", 15.5)
    val xenTv = Tv("Xen", "VBN561", 21.5)
    val sharpTv = Tv("Sharp", "NM238L", 5.5)

    println("${boschTv.changeChannelTransition(55)}")
    println("${boschTv.changeChannelTransition(5)}")
    println("${boschTv.decrementChannelPosition()}")
    println("${boschTv.turnOnSwitchOff()}")
    println("${boschTv.incrementChannelPosition()}")
    println("${boschTv.incrementVolume(52)}")
    println("${boschTv.incrementVolume(5)}")
    println("${boschTv.decrementVolume(10)}")
}