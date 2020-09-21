package com.example.dagger2pracconcrete.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    companion object {
        @Provides
        fun getThatString(application: Application): String {
            return if (application == null){
                "application null hai"
            } else {
                "application null nahi hai"
            }
        }

        @Provides
        fun getBoolean(application: Application): Boolean{
            return application == null
        }

        @Provides
        fun getNum(application: Application): Int {
            return if (application == null){
                0
            } else{
                1
            }
        }

    }
}