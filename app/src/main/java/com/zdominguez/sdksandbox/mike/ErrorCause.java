package com.zdominguez.sdksandbox.mike;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

interface ErrorCause {
    @DrawableRes int getDrawableRes();

    @StringRes default int getTitle() {
        return 0;
    }
}
