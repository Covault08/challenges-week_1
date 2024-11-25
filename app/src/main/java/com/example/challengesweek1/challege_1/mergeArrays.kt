package com.example.challengesweek1.challege_1

var arr1 = intArrayOf(5, 7, 6, 2, 6, 18)
var arr2 = intArrayOf(5, 1, 6, 2, 3, 18)
var total = arr1 + arr2


fun main() {
    println(total.toSet().sorted())
}
