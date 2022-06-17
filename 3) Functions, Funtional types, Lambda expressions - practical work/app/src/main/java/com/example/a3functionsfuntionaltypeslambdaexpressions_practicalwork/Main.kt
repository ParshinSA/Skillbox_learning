package com.example.a3functionsfuntionaltypeslambdaexpressions_practicalwork

fun main() {
    val encryptedString = "F2p)v\"y233{0->c}ttelciFc"

    val result = decryptString(encryptedString)

    println(result)
}

/*Выполняем программу с конца алгоритма зашифровки*/
fun decryptString(str: String): String {

    var firstHalf = ""
    var secondHalf = ""

    str.forEachIndexed { index, char ->
        if (index < (str.length / 2)) firstHalf += char else secondHalf += char
    }

    firstHalf = decryptFirstHalf(firstHalf)
    secondHalf = decryptSecondHalf(secondHalf)

    return firstHalf + secondHalf
}

fun decryptFirstHalf(str: String): String {
    return str
        .shift { it + 1 }
        .replace("5", "s")
        .replace("4", "u")
        .shift { it - 3 }
        .replace("0", "o")
}

fun decryptSecondHalf(str: String): String {
    return str
        .reversed()
        .shift { char: Char -> char - 4 }
        .replace("_", " ")
}

fun String.shift(func: (Char) -> Char): String {
    return this.map { func(it) }.joinToString("")
}