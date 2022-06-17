package com.example.a5arraylistsetmap_practicalwork

fun main() {
    val n = enterN()

    val listPhoneNumbers = inputNPhoneNumbers(n)

    println(listPhoneNumbers.filter { it.startsWith("+7") })
    println(listPhoneNumbers.toSet())
    println(listPhoneNumbers.sumOf { it.length })
    println(addUsersPhoneNumbers(listPhoneNumbers))
}

fun addUsersPhoneNumbers(listPhoneNumbers: List<String>): Map<String, String> {
    val mapPhoneNumbers = mutableMapOf<String, String>()

    listPhoneNumbers.toSet().forEach { number ->
        print("Enter a username for the number $number: ")
        val userName = enterUserName()
        mapPhoneNumbers[number] = userName
    }
    return mapPhoneNumbers
}

fun enterUserName(): String {
    val userInput = readLine()
    return if (userInput == "") {
        println("Incorrect username")
        print("Enter username: ")
        enterUserName()
    } else userInput!!
}

fun inputNPhoneNumbers(n: Int): List<String> {
    println("Enter $n phone numbers")
    val listPhoneNumber = mutableListOf<String>()

    while (listPhoneNumber.size < n) {
        listPhoneNumber.add(
            enterPhoneNumber()
        )
    }
    return listPhoneNumber
}

fun enterPhoneNumber(): String {
    print("Enter number: ")
    val userInput = readLine()!!

    return if (checkInputPhoneNumber(userInput)) userInput
    else {
        println("Incorrect phone number")
        enterPhoneNumber()
    }
}

fun checkInputPhoneNumber(userInput: String): Boolean {
    var resultChecking = true
    for (char in userInput) {
        resultChecking = if (char == '+' || char.digitToIntOrNull() != null) {
            true
        } else {
            resultChecking = false
            break
        }
    }
    return resultChecking
}

fun enterN(): Int {
    println("Enter number 'n'")
    val userInput = readLine()?.toIntOrNull()
    return if (userInput == null || userInput < 0) {
        println("Incorrect input")
        enterN()
    } else {
        userInput
    }
}
