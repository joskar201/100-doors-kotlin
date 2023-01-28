package hiker

import java.util.Arrays

fun answer():Int {
    val initialState = Array(100){true}
    
    for (i in 1..100){
        if(i == 1){
            initialState.forEachIndexed{ index , i ->
                                        if(index % 2 == 0){
                                            initialState[index] = !initialState[index]
                                        }
                                       }
        }
        if(i == 2){
            initialState.forEachIndexed{ index , i ->
                                        if(index % 3 == 1){
                                            initialState[index] = !initialState[index]
                                        }
                                       }
        }
    }
    
    
    println(Arrays.toString(initialState))
    return initialState.size
}
