package com.example.unittestapp

class Registration {
    val listOfUsers = listOf("Petya11", "Sasha12", "Kostya132")
    fun validateInput(
        username: String,
        password: String, confirmedPassword: String,
    ): Boolean {
        if (password != confirmedPassword) {
            return false
        }
        if (username !in listOfUsers) {
            return false
        }
        if (password.count { it.isDigit() } < 3) {
            return false
        }
        if (password.count { it.isUpperCase() } <=0) {
            return false
        }
        if (password.isBlank()) {
            return false
        }
        if (username.isBlank()) {
            return false
        }
        return true
    }
}