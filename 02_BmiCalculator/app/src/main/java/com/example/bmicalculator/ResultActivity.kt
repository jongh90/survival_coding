package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*
import org.jetbrains.anko.toast

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height = intent.getStringExtra("height").toInt()
        val weight = intent.getStringExtra("weight").toInt()

        val bmi = weight / Math.pow(height/100.0, 2.0)

        when
        {
            bmi >= 25 -> {
                resultTextView.text = "비만"
                imageView.setImageResource(R.drawable.ic_sentiment_very_dissatisfied_black_24dp)
            }
            bmi >= 18.5 -> {
                resultTextView.text = "정상"
                imageView.setImageResource(R.drawable.ic_sentiment_satisfied_black_24dp)
            }
            else -> {
                resultTextView.text = "저체중"
                imageView.setImageResource(R.drawable.ic_sentiment_dissatisfied_black_24dp)
            }
        }

        //Toast.makeText(this, "$bmi", Toast.LENGTH_SHORT).show()

        toast("$bmi")
    }
}
