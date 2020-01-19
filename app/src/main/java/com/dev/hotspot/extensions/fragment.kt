package com.dev.hotspot.extensions

import com.dev.hotspot.bloc.activities.main.MainActivity
import com.dev.hotspot.di.ActivityComponent

val androidx.fragment.app.Fragment.appComponent: ActivityComponent
    get() = (requireActivity() as MainActivity).appComponent