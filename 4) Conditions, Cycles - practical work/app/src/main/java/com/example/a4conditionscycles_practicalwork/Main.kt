package com.example.a4conditionscycles_practicalwork

fun main() {

    println("Enter number 'n'")
    val n = readLine()?.toIntOrNull()

    if (n == null || n < 0) {
        println("Incorrect input 'n'=$n")
        return main()
    } else {
        println(calculateNumberFibonacci(n))
    }


    val a = mutableListOf(1, 2, 3, 4)
    val aIterator = a.iterator()

    while (aIterator.hasNext()) {
        val item = aIterator.next()
        if (item < 0) aIterator.remove()
    }
}

fun calculateNumberFibonacci(
    threshold: Int,
    currentCount: Int = 1,
    firstNumber: Int = 0,
    secondNumber: Int = 1
): Int {
    return if (threshold == currentCount) firstNumber
    else calculateNumberFibonacci(
        threshold = threshold,
        currentCount = currentCount + 1,
        firstNumber = secondNumber,
        secondNumber = firstNumber + secondNumber
    )
}
