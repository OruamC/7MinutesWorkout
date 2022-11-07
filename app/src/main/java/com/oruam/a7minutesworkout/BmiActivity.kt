package com.oruam.a7minutesworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oruam.a7minutesworkout.databinding.ActivityBmiBinding

class BmiActivity : AppCompatActivity() {

    private var binding: ActivityBmiBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarBmiActivity)

        // Generates de back button on the toolbar
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Calculate BMI"
        }
        // set that on click on the back button will return to the home view
        binding?.toolbarBmiActivity?.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}