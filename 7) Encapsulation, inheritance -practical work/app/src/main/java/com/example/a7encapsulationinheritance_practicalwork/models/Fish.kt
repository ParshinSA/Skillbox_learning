package com.example.a7encapsulationinheritance_practicalwork.models

import kotlin.random.Random

class Fish(
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
        println("$name floats")
    }

    override fun createChild(): Fish {
        val newFish = Fish(
            name = this.name,
            maxAge = this.maxAge,
            energy = Random.nextInt(1, 10),
            weight = Random.nextInt(1, 5)
        )
        println("New Fish $newFish")
        return newFish
    }

    companion object{
        const val MAX_AGE = 4
    }
}