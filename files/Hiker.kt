package hiker

import java.util.Arrays

fun answer():Int {
    val initialState = BooleanArray(Boolean){true}
    initialState.forEachIndexed{ index , i ->
        if(index % 2 == 1){
            initialState[index] = !initialState[index]
        }
    }
    
    println(Arrays.toString(initialState))
    return initialState.size
}
