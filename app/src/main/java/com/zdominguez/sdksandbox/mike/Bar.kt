package com.zdominguez.sdksandbox.mike

class Bar : ErrorCause {
    override fun getDrawableRes(): Int {
        return 0
    }

    override fun getTitle(): Int {
        return android.R.string.ok
    }
}
