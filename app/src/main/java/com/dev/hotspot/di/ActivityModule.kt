package com.dev.hotspot.di

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.dev.base.utils.CustomLogger
import com.dev.base.utils.Logger
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides @Singleton fun provideActivityContext(): Context = activity

    @Provides @Singleton fun provideLogger(): Logger {
        return CustomLogger()
    }
}
