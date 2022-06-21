package com.example.a7encapsulationinheritance_practicalwork.models

import kotlin.random.Random

class NatureReserve {
     val reserve = mutableListOf(
        Bird(name = "Fil", Bird.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),
        Bird(name = "Scroll", Bird.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),
        Bird(name = "Qwerty", Bird.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),
        Bird(name = "Zaq", Bird.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),
        Bird(name = "Sed", Bird.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),

        Fish(name = "Lui", Fish.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),
        Fish(name = "Som", Fish.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),
        Fish(name = "Max", Fish.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),

        Dog(name = "Rik", Dog.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),
        Dog(name = "Kit", Dog.MAX_AGE, Random.nextInt(1, 10), Random.nextInt(1, 5)),
    )


    fun live() {
        val reserveIterator = reserve.iterator()

        while (reserveIterator.hasNext()) {
            val animals = reserveIterator.next()
            randomAction(animals)
            if (animals.isToOld) reserveIterator.remove()
        }
    }


    private fun randomAction(nextAnimals: Animals) {
        when (Random.nextInt(1, 4)) {
            1 -> nextAnimals.move()
            2 -> nextAnimals.eat()
            3 -> nextAnimals.sleep()
            else -> reserve.add(nextAnimals.createChild())
        }
    }
}

