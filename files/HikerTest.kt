// [X] See please-help.txt 

package hiker /*[X]*/

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe

class HikerTest /*[X]*/ : StringSpec() {

    init {
        "Example Test" {
            hiker.answer() shouldBe 42
        }

        "Other example test" {
            "a" shouldNotBe "b"
        }
    }
}
