package com.example.a7encapsulationinheritance_practicalwork.models

import kotlin.random.Random

class Bird(
    name: String,
    maxAge: Int,
    energy: Int,
    weight: Int
) : Animals(
    name, maxAge, energy, weight
) {

    override fun move() {
        if (isStopAnimal()) return
        super.move()
        println("$name flies")
    }

    override fun createChild(): Bird {
        val newBird = Bird(
            name = this.name,
            maxAge = this.maxAge,
            energy = Random.nextInt(1, 10),
            weight = Random.nextInt(1, 5)
        )
        println("New Bird $newBird")
        return newBird
    }

    companion object{
        const val MAX_AGE = 3
    }
}