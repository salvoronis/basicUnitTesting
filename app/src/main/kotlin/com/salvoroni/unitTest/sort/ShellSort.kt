package com.salvoroni.unitTest.sort

fun shellSort(arr: IntArray) {
    val n = arr.size
    var gap = n/2
    
    while(gap > 0) {
        stepShellSort(arr, gap, n)
        gap /= 2
    }
}

fun stepShellSort(arr: IntArray, gap: Int, n: Int) {
    var i = gap
    while(i < n) {
        val temp = arr[i]
        var j = i
        while(j >= gap && arr[j-gap] > temp) {
            arr[j] = arr[j-gap]
            j -= gap
        }
        arr[j] = temp
        i += 1
    }
}