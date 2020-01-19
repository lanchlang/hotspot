package com.dev.hotspot.di

import com.dev.hotspot.bloc.activities.main.MainActivity
import com.dev.hotspot.bloc.fragments.home.HomeFragment
import com.dev.hotspot.bloc.fragments.me.MeFragment
import com.dev.hotspot.bloc.fragments.notification.NotificationFragment
import com.dev.hotspot.bloc.fragments.search.SearchFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ActivityModule::class, ViewModelModule::class, DatabaseModule::class, NetworkModule::class])
interface ActivityComponent {
    //activity
    fun inject(mainActivity:MainActivity)
    fun inject(home:HomeFragment)
    fun inject(home:SearchFragment)
    fun inject(home:NotificationFragment)
    fun inject(home: MeFragment)
}
