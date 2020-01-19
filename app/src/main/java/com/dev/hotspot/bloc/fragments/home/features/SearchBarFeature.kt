package com.dev.hotspot.bloc.fragments.home.features

import android.view.View
import com.dev.base.views.lifecycle.LifecycleAwareFeature
import com.dev.hotspot.bloc.fragments.home.HomeFragment

class SearchBarFeature(var fragment: HomeFragment) : LifecycleAwareFeature {
    var searchBar:View?=null
    init {
//        searchBar= fragment.view?.findViewById<View>(R.id.search_bar).apply{
//             //to search fragment
//        }
    }
    override fun start() {

    }

    override fun stop() {

    }

}