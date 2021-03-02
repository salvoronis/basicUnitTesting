package com.salvoroni.unitTest.testOne

import com.salvoroni.unitTest.math._acos
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

class Part1Test {
    @Test fun testFunction1() = assertAll(
        {assertEquals(1.5707963267949, _acos(0.0), 0.00001)}
    )
}
