// [X] See please-help.txt 

package hiker /*[X]*/

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe

class HikerTest /*[X]*/ : StringSpec() {

    init {
        "Test initial state has 100 elements" {
            hiker.answer() shouldBe 100
        }

        "" {
            "a" shouldNotBe "b"
        }
    }
}
