package com.example.dagger2pracconcrete.di

import com.example.dagger2pracconcrete.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component (modules = [AndroidSupportInjectionModule::class])
interface AppComponent: AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: MyApplication): Builder

        fun build(): AppComponent
    }
}