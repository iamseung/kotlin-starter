package lec01

import java.io.BufferedReader
import java.io.FileReader
import java.lang.NumberFormatException

fun main() {

}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch(e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str} 은 숫자가 아닙니다")
    }
}

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch(e: NumberFormatException) {
        null
    }
}

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use {reader ->
        println(reader.readLine())
    }
}

fun repeat(str: String, num: Int, useNewLie: Boolean) {
    for(i in 1..num) {
        if (useNewLie)
            println(str)
        else
            print(str)
    }
}