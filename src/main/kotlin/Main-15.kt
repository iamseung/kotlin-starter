fun main() {
    map_test()
}

fun array() {
    val array = arrayOf(100,200)

    // index
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    array.plus(300)

    // index : value
    for ((idx, value ) in array.withIndex()) {
        println("${idx} ${value}")
    }
}

fun collection_test() {
    val numbers = listOf(100, 200)
    val listOf = listOf<Int>()

    val mutableListOf = mutableListOf<Int>()


    val emptyList = emptyList<Int>()
}

fun map_test() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "Monday"
    oldMap[2] = "Tuesday"

    val stringMap = mutableMapOf<String, String>()
    stringMap["zz"] = "zz"
    stringMap["aa"] = "aa"

    for (key in stringMap.keys) {
        println("${key} : ${stringMap[key]}")
    }

    for ((key, value) in stringMap.entries)
        println("${key} : ${value}")
}