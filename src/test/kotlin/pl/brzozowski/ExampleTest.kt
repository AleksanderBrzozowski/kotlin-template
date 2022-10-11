package pl.brzozowski

import io.kotest.matchers.ints.shouldBeExactly

class ExampleTest : BaseTest({

    "2 + 2 = 4" {
        (2 + 2) shouldBeExactly 4
    }
})
