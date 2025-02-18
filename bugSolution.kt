fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val removed = list.remove(6) //Check the return of remove
    if (!removed) {
        println("Element not found in the list")
    } else {
        println(list)
    }

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val removedSet = set.remove(6) //Check the return of remove
    if (!removedSet) {
        println("Element not found in the set")
    } else {
        println(set)
    }

    val map = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    val removedMap = map.remove("d") //Check the return of remove
    if (removedMap == null) {
        println("Element not found in the map")
    } else {
        println(map)
    }
} 