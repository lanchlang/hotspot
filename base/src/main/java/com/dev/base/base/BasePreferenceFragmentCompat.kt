package com.dev.base.base

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.widget.LinearLayout
import androidx.core.view.ViewCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.preference.PreferenceFragmentCompat
import androidx.recyclerview.widget.RecyclerView
import com.dev.base.R
import com.dev.base.extensions.dp2px
import com.dev.base.utils.Logger
import javax.inject.Inject

abstract class BasePreferenceFragmentCompat: PreferenceFragmentCompat(),BackHandler{
     open fun initView(view: View){
         val toolbar=view.findViewById<LinearLayout>(R.id.toolbar)
         listView.apply {
             overScrollMode= View.OVER_SCROLL_NEVER
             isVerticalScrollBarEnabled=false
             this.addOnScrollListener(object:RecyclerView.OnScrollListener(){
                 override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                     if(recyclerView.canScrollVertically(-1)){
                         toolbar.elevation=requireContext().dp2px(4).toFloat()
                     }else{
                         toolbar.elevation=0f
                     }
                 }
             })
         }
         setUpToolbar(toolbar)
     }

    open fun setUpToolbar(toolbar: LinearLayout?){

    }

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    @Inject
    lateinit var logger: Logger

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
    }

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
    override fun setDivider(divider: Drawable?) {
        super.setDivider(ColorDrawable(Color.TRANSPARENT))
    }
    override fun setDividerHeight(height: Int) {
        super.setDividerHeight(0)
    }
}