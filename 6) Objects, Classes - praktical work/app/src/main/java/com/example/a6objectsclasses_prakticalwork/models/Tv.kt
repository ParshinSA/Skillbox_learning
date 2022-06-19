package com.example.a6objectsclasses_prakticalwork.models

import com.example.a6objectsclasses_prakticalwork.Channels

class Tv(
    val brand: String,
    val model: String,
    val diagonalSize: Double
) {
    var currentVolume = MIN_VOLUME
        private set

    var onOf: Boolean = false
        private set

    private var channelsList = Channels.getRandomChannels()
    private var currentChannel = channelsList.keys.first()

    fun turnOnSwitchOff() {
        onOf = !onOf
        println("state tv $onOf")
        if (onOf) println("current channel = $currentChannel ${channelsList[currentChannel]}")
    }

    fun changeChannelTransition(channel: Int) {
        println("changeChannelTransition")
        if (channel in channelsList.keys) {
            currentChannel = channel
            // если телевизор выключен -> включить
            if (!onOf) turnOnSwitchOff()
        } else println("Incorrect channel")
        println("current channel = $currentChannel ${channelsList[currentChannel]}")
    }

    fun incrementChannelPosition() {
        println("incrementChannelPosition")
        if (onOf) {
            currentChannel++
            if (currentChannel > channelsList.keys.last())
                currentChannel = channelsList.keys.first()
            println("current channel = $currentChannel ${channelsList[currentChannel]}")
        } else turnOnSwitchOff()
    }

    fun decrementChannelPosition() {
        println("decrementChannelPosition")
        if (onOf) {
            currentChannel--
            if (currentChannel < channelsList.keys.first())
                currentChannel = channelsList.keys.last()
            println("current channel = $currentChannel ${channelsList[currentChannel]}")
        } else turnOnSwitchOff()
    }

    fun incrementVolume(valueInc: Int) {
        println("incrementVolume $valueInc")
        currentVolume = minOf(currentVolume + valueInc, MAX_VOLUME)
        println("CurrentVolume: $currentVolume")
    }

    fun decrementVolume(valueDec: Int) {
        println("decrementVolume $valueDec")
        currentVolume = maxOf(currentVolume - valueDec, MIN_VOLUME)
        println("CurrentVolume: $currentVolume")
    }

    companion object {
        const val MAX_VOLUME = 50
        const val MIN_VOLUME = 0
    }
}