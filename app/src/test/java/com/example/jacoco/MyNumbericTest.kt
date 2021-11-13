package com.example.jacoco

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MyNumbericTest {
    private lateinit var myNumeric: MyNumeric

    @Before
    fun setup() {
        myNumeric = MyNumeric()
    }

    @Test
    fun `sum`() {
        Assert.assertEquals(
            3,
            myNumeric.sum(1, 2)
        )
    }

    @Test
    fun `min`() {
        Assert.assertEquals(
            -1,
            myNumeric.min(1, 2)
        )
    }
}
