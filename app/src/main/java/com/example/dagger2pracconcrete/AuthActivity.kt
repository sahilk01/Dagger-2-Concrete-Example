package com.example.dagger2pracconcrete

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

private const val TAG = "AuthActivity"

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var glideInstance: RequestManager

    @Inject
    lateinit var logo: Drawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        setLogo()
    }

    private fun setLogo() {
        glideInstance
            .load(logo)
            .into(login_logo)
    }
}