package com.example.unittestapp

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)

class ResourceComparatorTest {

    private  var context: Context? = null
    private var calculator: Calculator = mock(Calculator::class.java)
    private var mathematics: Mathematics? = null

    @Before
    fun setUp() {
        context = ApplicationProvider.getApplicationContext()
        mathematics = Mathematics(calculator)

    }
    @After
    fun tearDown(){
        //liveData.removeObserver(observer)
    }

    @Test
    fun invokeCalculatorAddWhenAddMathematicsInvoked_returnTrue() {
        mathematics?.add(firstNumber = 10, secondNumber = 10)

        verify(calculator, atLeastOnce())
            .add(firstNumber = 10, secondNumber = 10)
    }

    @Test
    fun resourceStringSameAsGivenString_returnTrue() {
        val context = ApplicationProvider
            .getApplicationContext<Context>()

        val result = ResourceComparator()
            .isEqual(context = context, resId = R.string.app_name, string = "UnitTestApp")

        assertTrue(result)
    }
    @Test
    fun resourceStringDifferentAsGivenString_returnFalse(){
        val context = ApplicationProvider
            .getApplicationContext<Context>()

        val result = ResourceComparator()
            .isEqual(context = context, resId = R.string.app_name, string = "Lesson33")

        assertFalse(result)
    }
}