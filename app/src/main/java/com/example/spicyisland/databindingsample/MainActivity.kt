package com.example.spicyisland.databindingsample

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.spicyisland.databindingsample.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        user = ViewModelProviders.of(this).get(User::class.java)
        binding.user = user
        binding.setLifecycleOwner(this)

        Handler().postDelayed({
            user.name.value = mutableListOf("after", "after")

        }, 1000)
    }
}
