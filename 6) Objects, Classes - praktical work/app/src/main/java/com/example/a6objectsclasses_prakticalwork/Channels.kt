package com.example.a6objectsclasses_prakticalwork

import kotlin.random.Random

object Channels {
    private val listChannels =
        listOf(
            "1channel",
            "TNT",
            "Friday",
            "NationalGeographic",
            "2x2",
            "ORT",
            "RTR",
            "STS",
            "RenTv",
            "MTv"
        )


    fun getRandomChannels(): Map<Int, String> {
        val shuffledChannelNames = listChannels.shuffled()
        val maxNumberChannels = Random.nextInt(MIN_CHANNEL_LIST_SIZE, shuffledChannelNames.size)
        val resultChannelList = mutableMapOf<Int, String>()

        for (numberChannels in 1..maxNumberChannels) {
            resultChannelList[numberChannels] = shuffledChannelNames[numberChannels - 1]
        }

        return resultChannelList
    }

    private const val MIN_CHANNEL_LIST_SIZE = 5
}