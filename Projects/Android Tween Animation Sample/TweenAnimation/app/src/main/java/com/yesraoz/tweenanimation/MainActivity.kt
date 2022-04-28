package com.yesraoz.tweenanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        init()
        image = findViewById(R.id.imageView)

        val anim=AnimationUtils.loadAnimation(this,R.anim.my_anim)

        image.startAnimation(anim)
    }

    private fun init() {

        binding.button.setOnClickListener(this)


    }

  /*  override fun OnClick(view: View?){
        when(view?.id){
            binding.button.id -> {
                //click

            }
        } */

}