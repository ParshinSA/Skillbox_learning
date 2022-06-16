package com.example.a2variablesdatatypespracticalwork

fun main() {

    val firstName = "Sergey"
    val lastName = "Parshin"
    var height = 1.75
    val weight = 75.5f
    var isChild: Boolean = isChild(height, weight)

    val info = """
        My info:
        first name - $firstName,
        last name - $lastName,
        height - $height,
        weight - $weight,
        is child - $isChild
    """.trimIndent()

    println(info)

    height = 1.4
    isChild = isChild(height, weight)

    val info2 = """
        My info:
        first name - $firstName,
        last name - $lastName,
        height - $height,
        weight - $weight,
        is child - $isChild
    """.trimIndent()

    println(info2)
}

fun isChild(height: Double, weight: Float): Boolean {
    return height < 1.5 || weight < 40
}
