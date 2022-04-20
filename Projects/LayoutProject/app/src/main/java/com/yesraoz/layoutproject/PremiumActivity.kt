package com.yesraoz.layoutproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.text.bold
import androidx.core.text.color
import androidx.core.text.scale

class PremiumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premium)

        val tvSpannableString: TextView= findViewById(R.id.tv_spannable_string)

        val spannableString= SpannableString()
            .bold {scale (proportion: 1.5f) {append("$11.99\n")} }
            .bold{ color(ContextCompat.getColor(this@PremiumActivity, R.color.darkgrey)) {append("$11.99")} }
            .bold{ color(ContextCompat.getColor(this@PremiumActivity, R.color.grey)) {append("per month\n")} }
            .bold{ color(ContextCompat.getColor(this@PremiumActivity, R.color.darkgrey)) {append("$143.99")} }
            .bold{ color(ContextCompat.getColor(this@PremiumActivity, R.color.grey)) {append("per year\n")} }

        tvSpannableString.text=spannableString
    }
}