package com.example.dagger2pracconcrete.di

import com.example.dagger2pracconcrete.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract fun authActivity(): AuthActivity

    companion object {
        @Provides
        fun getString(): String {
            return "this is sahil's project"
        }
    }

}