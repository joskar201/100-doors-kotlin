package hiker

import java.util.Arrays

fun answer():Int {
    val initialState = Array(100){true}
    
    for (i in 1..100){
        
        if(i == 1){
            initialState.forEachIndexed{ index , j ->
                                        if(index!== 0 && index % (i+1) == 0){
                                            initialState[index-1] = !initialState[index-1]
                                        }
                                       }
        }
    }
    
    initialState.forEachIndexed{ index , i ->
                                when(i){
                                    true -> println("door ${index + 1} closed")
                                    false -> println("door ${index + 1} open")
                                }
                               }
    
    return initialState.size
}
