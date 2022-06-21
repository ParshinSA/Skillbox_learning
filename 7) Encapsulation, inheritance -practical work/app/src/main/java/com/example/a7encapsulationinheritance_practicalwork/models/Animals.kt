package com.example.a7encapsulationinheritance_practicalwork.models

import kotlin.random.Random

open class Animals(
    val name: String,
    val maxAge: Int,
    var energy: Int,
    var weight: Int
) {
    var currentAge: Int = 0

    val isToOld: Boolean
        get() = currentAge >= maxAge

    fun sleep() {
        if (isStopAnimal()) return
        energy += 5
        currentAge++
        println("$name sleeping")
    }

    fun eat() {
        if (isStopAnimal()) return
        energy += 3
        weight += 1
        tryIncrementAge()
        println("$name eating")
    }

    open fun move() {
        if (isStopAnimal()) return
        energy -= 5
        weight -= 1
        tryIncrementAge()
        println("$name moving")
    }

    open fun createChild(): Animals {
        val newAnimal = Animals(
            name = this.name,
            maxAge = this.maxAge,
            energy = Random.nextInt(1, 10),
            weight = Random.nextInt(1, 5)
        )
        println("New animal $newAnimal")
        return newAnimal
    }

    protected fun isStopAnimal(): Boolean {
        return isToOld || energy == 0 || weight == 0
    }

    private fun tryIncrementAge() {
        if (Random.nextBoolean()) currentAge++
    }

    override fun toString(): String {
        return "name $name, maxAge $maxAge, energy $energy, weight $weight, currentAge $currentAge"
    }
}