package hiker

fun answer():Int {
    val initialState = Array(100){0}
    initialState.forEachIndexed{ index , i ->
        if(index % 2 == 0){
                initialState[index] = 1
        }
        println(i)
    }
    return initialState.size
}
