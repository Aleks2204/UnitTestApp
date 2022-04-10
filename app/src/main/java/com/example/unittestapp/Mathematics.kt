package com.example.unittestapp

class Mathematics(val calculator: Calculator) {

    fun add(firstNumber: Int, secondNumber: Int) {
        calculator.add(firstNumber = firstNumber, secondNumber = secondNumber)
    }

    fun subtract(firstNumber: Int, secondNumber: Int) {
        calculator.subtract(firstNumber = firstNumber, secondNumber = secondNumber)
    }

    fun multiply(firstNumber: Int, secondNumber: Int) {
        calculator.multiply(firstNumber = firstNumber, secondNumber = secondNumber)
    }

    fun divide(firstNumber: Int, secondNumber: Int) {
        calculator.divide(firstNumber = firstNumber, secondNumber = secondNumber)
    }
}