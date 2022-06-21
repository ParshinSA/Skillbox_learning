package com.example.a7encapsulationinheritance_practicalwork.models

import kotlin.random.Random

class Dog(
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
        println("$name running")
    }

    override fun createChild(): Dog {
        val newDog = Dog(
            name = this.name,
            maxAge = this.maxAge,
            energy = Random.nextInt(1, 10),
            weight = Random.nextInt(1, 5)
        )
        println("New Dog $newDog")
        return newDog
    }

    companion object {
        const val MAX_AGE = 8
    }
}