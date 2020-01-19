package com.dev.hotspot.bloc.activities.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.dev.base.base.BaseDaggerActivity
import com.dev.hotspot.R
import com.dev.hotspot.di.ActivityComponent
import com.dev.hotspot.di.ActivityModule
import com.dev.hotspot.di.DaggerActivityComponent

class MainActivity : BaseDaggerActivity() {
    val appComponent: ActivityComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule(this))
            .build()
    }
    lateinit var viewModel: MainViewModel
    override fun injectMembers() {
        appComponent.inject(this)
        viewModel= ViewModelProvider(this,factory).get(MainViewModel::class.java)
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun initView(savedInstanceState: Bundle?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initData(savedInstanceState: Bundle?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
