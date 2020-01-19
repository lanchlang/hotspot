package com.dev.base.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.dev.base.R
import com.dev.base.utils.Logger
import javax.inject.Inject


abstract class BaseFragment:Fragment(),BackHandler{
    @Inject
    lateinit var factory: ViewModelProvider.Factory
    @Inject
    lateinit var logger: Logger
    //获取layoutId创建View
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(getLayoutResId(), container, false)
    }

    //默认不设置
    abstract fun getLayoutResId(): Int

    override fun onCreateAnimation(transit: Int, enter: Boolean, nextAnim: Int): Animation? {
        if (nextAnim != R.anim.holder) {
            ViewCompat.setTranslationZ(view!!, 1f)
        } else {
            ViewCompat.setTranslationZ(view!!, 0f)
        }
        return super.onCreateAnimation(transit, enter, nextAnim)
    }
    override fun onBackPressed(): Boolean {
        findNavController().popBackStack()
        return true
    }
}