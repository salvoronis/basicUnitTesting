package com.salvoroni.unitTest.testTwo

import com.salvoroni.unitTest.sort.shellSort
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.Assert;

class ShellSortTest {
    @Test fun resultsTest() = assertAll(
        {
            val testArr: IntArray = intArrayOf(41,23,456,22,7,1,2,9)
            val expected: IntArray = intArrayOf(1,2,7,9,22,23,41,456)
            shellSort(testArr)
            Assert.assertArrayEquals(expected, testArr)
        }
    )
}