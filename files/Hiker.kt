package hiker

fun answer():Int {
    val initialState = Array(100){0}
    initialState.forEachIndexed{ index , i ->
        if(index % 2 == 1){
            initialState[index] = 1
        }
    }
    
    println(Arrays.toString(initialState))
    return initialState.size
}
