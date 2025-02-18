fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.remove(3)
    println(list) // Output: [1, 2, 4, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.remove(3)
    println(set) // Output: [1, 2, 4, 5]

    val map = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    map.remove("c")
    println(map) // Output: {a=1, b=2}

    //The uncommon error occurs if you try to remove an element that does not exist.
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    list2.remove(6) //This will not throw an exception, it will just return false. It won't modify the list
    println(list2) // Output: [1, 2, 3, 4, 5]

    val set2 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set2.remove(6) //This will not throw an exception, it will just return false. It won't modify the set
    println(set2) // Output: [1, 2, 3, 4, 5]

    val map2 = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    map2.remove("d") //This will not throw an exception, it will just return null. It won't modify the map
    println(map2) // Output: {a=1, b=2, c=3}
}