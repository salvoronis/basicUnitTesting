package com.salvoroni.unitTest.math

import kotlin.math.*;
import com.salvoroni.unitTest.sort.shellSort
import com.salvoroni.unitTest.models.*

fun _acos(x: Double): Double {
    if (x < -1 || x > 1)
        throw BeyondRangeException()
    val odd_sequence: (Int) -> Int = {(1..it step 2).fold(1) { prew, i -> prew * i }}
    val denominator: (Int) -> Int = {(2..it step 2).fold(1) { prew, i -> prew * i * (i+1) }}
    return PI/2 - (x + generateSequence(1) { n -> n + 1 }.take(7).map { n -> (odd_sequence(n) * x.pow(2*n+1)) / (denominator(n)) }.sum())
}
