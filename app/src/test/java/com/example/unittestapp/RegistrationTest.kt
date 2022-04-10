package com.example.unittestapp

import junit.framework.Assert.assertEquals
import org.junit.Test

class RegistrationTest {

    @Test
    fun `password and confirmed password are different return false`() {
        val result = Registration()
            .validateInput(username = "Some username",
                password = "100101", confirmedPassword = "password")

        assertEquals(result, false)
    }

    @Test
    fun `password doesn't have enough numbers`() {
        val result = Registration()
            .validateInput(username = "Username", password = "qwerty", confirmedPassword = "qwerty")

        assertEquals(result, false)
//isUpp
    }

    @Test
    fun `username is not in the list return false`() {
        val result = Registration()
            .validateInput(username = "username", password = "10010", confirmedPassword = "10010")

        assertEquals(result, false)
    }

    @Test
    fun `password has upper case return true`() {
        val result = Registration()
            .validateInput(username = "Sasha12", password = "Q1234", confirmedPassword = "Q1234")

        assertEquals(result, true)
    }

    @Test
    fun `password is blank return false`() {
        val result = Registration()
            .validateInput(username = "Sasha12", password = "", confirmedPassword = "")

        assertEquals(result, false)
    }

    @Test
    fun `username is blank return false`() {
        val result = Registration()
            .validateInput(username = "", password = "Q123", confirmedPassword = "Q123")

        assertEquals(result, false)
    }
}