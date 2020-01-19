package com.dev.hotspot.bloc.fragments.notification

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.dev.base.base.BackHandler
import com.dev.base.base.BaseFragment
import com.dev.hotspot.R
import com.dev.hotspot.extensions.appComponent

class NotificationFragment : BaseFragment(), BackHandler {
    lateinit var viewModel: NotificationViewModel
    override fun onAttach(context: Context) {
        super.onAttach(context)
        appComponent.inject(this)
        viewModel=ViewModelProvider(this, factory).get(NotificationViewModel::class.java)
    }

    override fun getLayoutResId(): Int {
        return R.layout.fragment_home
    }

    override fun onBackPressed(): Boolean {
       return true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}