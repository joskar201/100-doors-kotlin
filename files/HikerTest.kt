// [X] See please-help.txt 

package hiker /*[X]*/

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe

class HikerTest /*[X]*/ : StringSpec() {

    init {
        "" {
            "a" shouldNotBe "b"
        }
    }
}
