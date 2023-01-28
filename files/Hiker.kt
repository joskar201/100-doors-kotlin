package hiker

fun answer():Int {
    val initialState = Array(100){0}
    initialState.forEachIndexed{index, i ->{
        if(it % 2 == 0){
                initialState[index] = 1
        }
        print(i)
    }
    return initialState.size
}
