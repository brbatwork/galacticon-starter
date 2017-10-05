package com.raywenderlich.galacticon

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false) : View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}
