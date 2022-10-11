package pl.brzozowski

import io.kotest.core.spec.style.FreeSpec

abstract class BaseTest(body: FreeSpec.() -> Unit = {}) : FreeSpec() {

    init {
        body()
    }
}
