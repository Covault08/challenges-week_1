package com.example.challengesweek1.challege_1


var num: Double = 0.000
const val purchase: Double = 117.74
const val cashGiven: Double = 220.00
var changeTypes: ArrayList<String> = ArrayList()

fun getChange(purchasePrice: Double, cashGiven: Double): Double = cashGiven - purchasePrice

fun printResults() {
    num = getChange(purchase, cashGiven)
    println("Purchase Price: $purchase")
    println("CashGiven: $cashGiven")
    println("The change is: $num")
}

fun Double.getMoneyTypes() {
    when {
        (this >= 100) -> {
            num -= 100
            changeTypes.add("ONE HUNDRED (100.00)")
        }

        (this >= 50) -> {
            num -= 50
            changeTypes.add("FIFTY (50.00)")
        }

        (this >= 20) -> {
            num -= 20
            changeTypes.add("TWENTY (20.00)")
        }

        (this >= 10) -> {
            num -= 10
            changeTypes.add("TEN (10.00)")
        }

        (this >= 5) -> {
            num -= 5
            changeTypes.add("FIVE (5.00)")
        }

        (this >= 2) -> {
            num -= 2
            changeTypes.add("TWO (2.00)")
        }

        (this >= 1) -> {
            num -= 1
            changeTypes.add("ONE (1.00)")
        }

        (this >= 0.5) -> {
            num -= 0.5
            changeTypes.add("HALF DOLLAR (0.50)")
        }

        (this >= 0.25) -> {
            num -= 0.25
            changeTypes.add("QUARTER (0.25)")
        }

        (this >= 0.10) -> {
            num -= 0.25
            changeTypes.add("DIME (0.10)")
        }

        (this >= 0.05) -> {
            num -= 0.05
            changeTypes.add("NICKEL (0.05)")
        }

        (this >= 0.01) -> {
            num -= 0.01
            changeTypes.add("PENNY (0.01)")
        }
    }
}

fun main() {
    printResults()
    if (cashGiven > purchase) {
        do {
            num.getMoneyTypes()
        } while (num > 0.01)
    } else if (cashGiven == purchase) {
        changeTypes.add("ZERO")
    } else {
        changeTypes.add("ERROR")
    }
    println(changeTypes)
}