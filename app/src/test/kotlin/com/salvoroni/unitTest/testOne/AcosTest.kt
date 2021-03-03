package com.salvoroni.unitTest.testOne

import com.salvoroni.unitTest.math._acos
import com.salvoroni.unitTest.math.BeyondRangeException
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.assertFailsWith

class AcosTest {
    @Test fun testFunction1() = assertAll(
        {assertEquals(1.5707963267949, _acos(0.0), 0.00001)},
        {assertEquals(1.47062891, _acos(0.1), 0.001)},
        {assertEquals(1.67096375, _acos(-0.1), 0.001)}
    )

    @Test fun middleRange() = assertAll(
        {assertEquals(1.04719755, _acos(0.5), 0.2)},
        {assertEquals(2.0943951, _acos(-0.5), 0.2)}
    )

    @Test fun borderTest() = assertAll(
        {assertEquals(0.0,_acos(1.0), 0.2)},
        {assertEquals(3.14159265, _acos(-1.0), 0.2)}
    )

    @Test fun rangeTest() = assertAll(
        {assertFailsWith<BeyondRangeException>{_acos(1.1)}},
        {assertFailsWith<BeyondRangeException>{_acos(-1.1)}}
    )
}
