package hiker

import java.util.Arrays

fun answer():Int {
    val initialState = Array(100){true}
    
    for (i in 1..100){
        /*
        if(i == 1){
            initialState.forEachIndexed{ index , i ->
                                        if(index!== 0 && index % 2 == 0){
                                            initialState[index-1] = !initialState[index-1]
                                        }
                                       }
        }*/
        if(i == 2){
            initialState.forEachIndexed{ index , i ->
                                        if(index!== 0 && index % 3 == 0){
                                            initialState[index-1] = !initialState[index-1]
                                        }
                                       }
        }
    }
    
    
    println(Arrays.toString(initialState))
    return initialState.size
}
