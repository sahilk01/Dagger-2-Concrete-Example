package com.example.dagger2pracconcrete

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

private const val TAG = "AuthActivity"

class AuthActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var name: String

    var isApplicationNull: Boolean? = null
    @Inject set

    var getNum: Int? = null
    @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        tv.text = ("message: $name is application null?: $isApplicationNull ... if its 0 that application is null else 1: $getNum")

    }
}