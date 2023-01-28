package hiker

fun answer():Int {
    val initialState = Array(100){0}
    initialState.forEach{
        println(it)
    }
    return initialState.size
}
