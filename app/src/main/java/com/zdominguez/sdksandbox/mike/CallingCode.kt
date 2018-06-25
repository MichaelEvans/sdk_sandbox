package com.zdominguez.sdksandbox.mike

class CallingCode {
    fun example() {
        val foo = Foo()
        val bar = Bar()
        if (foo.title != 0) {
            // do something, but it's going to be 0
        }
        if (bar.title != 0) {
            // do something, it wont be 0
        }
    }
}
