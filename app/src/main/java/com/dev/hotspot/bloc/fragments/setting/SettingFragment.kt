/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package com.dev.hotspot.bloc.fragments.setting

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.dev.base.base.BackHandler
import com.dev.base.base.SimplePreferenceFragmentCompat
import com.dev.hotspot.R

class SettingFragment : SimplePreferenceFragmentCompat(), BackHandler {

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_setting, rootKey)
    }

    override fun initView(view: View) {
        super.initView(view)
        view.findViewById<TextView>(R.id.title)?.apply {
            text = getString(R.string.setting)
        }

    }

    override fun setUpToolbar(toolbar: LinearLayout?) {
        toolbar?.findViewById<View>(R.id.back_icon)?.apply {
            setOnClickListener {
                onBackPressed()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        setupPreferences()
    }

    private fun setupPreferences() {
//        findPreferenceById(R.string.pref_key_clear_cache_display)?.apply {
//            this.setOnPreferenceClickListener {
//                val direction = MainNavDirections.actionGlobalCacheSettingFragment()
//                findNavController().navigate(direction)
//                true
//            }
//        }
    }
}
