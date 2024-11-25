package com.example.challengesweek1.challege_1

import java.util.regex.Matcher
import java.util.regex.Pattern


var card: String = "1121-2121-3121-0321"
var Expiry: String = "03/21"
val first = card.split("-")[0]
val last = card.split("-")[3]
val lastHlf = last.substring(0,2) + "/" + last.substring(2)
var valid:Boolean = false
var bnk: String = ""

fun validator(psw: String): Boolean {
    if (psw.length == 16) {
        val letras: Pattern = Pattern.compile("[a-zA-z]")
        val numeros: Pattern = Pattern.compile("[0-9]")
        val especiales: Pattern = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]")

        val letra: Matcher = letras.matcher(psw)
        val numero: Matcher = numeros.matcher(psw)
        val especial: Matcher = especiales.matcher(psw)

        return letra.find() && numero.find() && especial.find()
    } else return false
}

fun validCard(){
    when {
        (first == ("1121")) -> {
            bnk = ("Bank is ACME")
            valid = true
        }
        (first == ("1111")) -> {
            bnk = ("Bank is ALFA")
            valid = true
        }
        (first == ("3796")) -> {
            bnk = ("Bank is AMEX")
            valid = true
        }
        else -> {
            bnk = ("ERROR")
            valid = false
        }
    }
}
fun validExpiry(): Boolean {
    if (Expiry ==lastHlf) {
        println("Output: $valid ($bnk, and expiry matches)")
        return true

    }  else {
        println("Output: false ($bnk, Expiry date does not match)")
        return false
    }
}

fun main() {
    if (validator(card)) {
        validCard()
        println("Card Number: $card")
        println("Expiry Date: $lastHlf")
        validExpiry()
    }else{
        println("Error")
    }
}