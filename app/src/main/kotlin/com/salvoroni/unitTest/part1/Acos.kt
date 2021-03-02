package com.salvoroni.unitTest.part1

import kotlin.math.*;

fun _acos(x: Double): Double {
    val odd_sequence: (Int) -> Int = {(1..it step 2).fold(1) { prew, i -> prew * i }}
    val denominator: (Int) -> Int = {(2..it step 2).fold(1) { prew, i -> prew * i * (i+1) }}
    return PI/2 - (x + generateSequence(1) { n -> n + 1 }.take(10).map { n -> (odd_sequence(n) * x.pow(2*n+1)) / (denominator(n)) }.sum())
}

fun main() {
    println(_acos(0.0))
}
